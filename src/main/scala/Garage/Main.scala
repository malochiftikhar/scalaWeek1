package Garage

object Main {

  def main(args: Array[String]): Unit = {
  val Person = new Person("iftikhar", "Khan", 21)
  val Person1 = new Person("Danish", "Khan", 21)

    println(Person1.firstName)
    println(Person.firstName)
  }
}
