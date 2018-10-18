package Slick

import slick.jdbc.MySQLProfile.api._

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}

object Main extends App {

  val db = Database.forConfig("mysqlDB")
  val peopleTable = TableQuery[People]
  val dropPeopleCmd = DBIO.seq(peopleTable.schema.drop)
  val initPeopleCmd = DBIO.seq(peopleTable.schema.create)


  def dropDB = {
    val dropFuture = Future {
      db.run(dropPeopleCmd)
    }

    Await.result(dropFuture, Duration.Inf).andThen({
      case Success(_) => initialisePeople
      case Failure(error) => println("Dropping the table failed due to: " + error.getMessage)
        initialisePeople
    })
  }

  def initialisePeople = {

    val setupFuture = Future {
      db.run(initPeopleCmd)
    }

    Await.result(setupFuture, Duration.Inf).andThen({
      case Success(_) => runQuery
      case Failure(error) => println("Initialising the table failed due to: " + error.getMessage)
    })
  }

  def runQuery = {
    val insertPeople = Future {
      val query = peopleTable ++= Seq(
        (10, "Jack", "Wood", 36),
        (20, "Tim", "Brown", 24),
        (30, "Danish", "Khan", 18)

      )

      println(query.statements.head)
      db.run(query)
    }
    Await.result(insertPeople, Duration.Inf).andThen {
      case Success(_) => update()
      case Failure(error) => println("Help! Something went wrong! " + error.getMessage)
    }
  }

  def listPeople = {
    val queryFuture = Future {
      db.run(peopleTable.result).map(_.foreach {
        case (id, fName, lName, age) => println(s" $id $fName $lName $age")
      })
    }
    Await.result(queryFuture, Duration.Inf).andThen {
      case Success(_) => println( )
      case Failure(error) =>
        println("Listing people failed due to: " + error.getMessage)
    }
  }

  def update(): Unit = {
    val queryFuture = Future {
      db.run(peopleTable.filter(_.fName === "Jack")
        .map(p => (p.fName, p.age))
        .update(("Ifti", 21)))
    }
    Await.result(queryFuture, Duration.Inf).andThen {
      case Success(_) => listPeople
      case Failure(error) => println("Updating people failed due to: " + error.getMessage)
    }
  }

  def delete(name : String): Unit = {

    val queryFuture = Future {
      db.run(peopleTable.filter(p => p.fName === name).delete)
    }
    Await.result(queryFuture, Duration.Inf).andThen {
      case Success(_) => println(s" $name deleted")
      case Failure(error) => println("Deleting failed due to: " + error.getMessage)
    }
  }

  def searchByName(name : String): Unit = {
    val queryFuture = Future {
      db.run(peopleTable.filter(p => p.fName === name).result).map(println)
    }
    Await.result(queryFuture, Duration.Inf).andThen {
      case Success(_) => println( )
      case Failure(error) => println("could not find name: " + error.getMessage)
    }
  }

  def countPeople(): Unit = {
    val queryFuture = Future {
      db.run(peopleTable.length.result).map(println)
    }
    Await.result(queryFuture, Duration.Inf).andThen {
      case Success(_) => println()
      case Failure(error) => println("failed to count people: " + error.getMessage)
    }
  }

  def averageAge(): Unit = {
    val avgAge = Future {
    db.run(peopleTable.map(_.age).avg.result).map(println)
    }
    Await.result(avgAge, Duration.Inf).andThen {
      case Success(_) => println()
      case Failure(error) => println("failed to workout average age: " + error.getMessage)
    }
  }
//
//  def commonName(): Unit = {
//    val commonName{
//      db.run(peopleTable.groupBy(_.fName).map{
//
//      }
//    }
    Await.result(commonName, Duration.Inf).andThen {
      case Success(_) => println()
      case Failure(error) => println("failed to count people: " + error.getMessage)
    }
  }

  dropDB
  Thread.sleep(1000)
  delete("Ifti")
  searchByName("Danish")
  countPeople()
  averageAge()
  db.close()
}
