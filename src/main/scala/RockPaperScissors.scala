import scala.util.Random

object RockPaperScissors {

  def main(args: Array[String]): Unit = {

//    println(userMove())
    while (true) {
      gamePlay()
    }
  }

  def user (): String = {
    val name = scala.io.StdIn.readLine()
    name
  }

  def userMove () : String = {
    println("Rock, Paper, or Scissors? ")
    val move = scala.io.StdIn.readLine()

    move match {
      case  "Rock" => "Rock"
      case  "Paper" => "Paper"
      case  "Scissors" => "Scissors"
      case _ => "Please Enter Rock, Paper or Scissors"
    }
  }

  def computerMove () : String = {
    val moves = Array("Rock", "Paper", "Scissors")
    val rand = new Random((System.currentTimeMillis()))
    val randomMove = rand.nextInt(moves.length)
    val move = moves(randomMove)
    move
  }

  def gamePlay () : Unit = {

    val win = "You won!"
    val lose = "You lose :D"

    val user1 = userMove()
    val ai = computerMove()
    println(ai)
//    val ai = "Rock"

    if (user1.equalsIgnoreCase("Rock") && ai.equalsIgnoreCase("Scissors")) {
      println(win)
    } else if (user1.equalsIgnoreCase("Paper") && ai.equalsIgnoreCase("Rock")) {
      println(win)
    } else if (user1.equalsIgnoreCase("Scissors") && ai.equalsIgnoreCase("Paper")) {
      println(win)
    } else {
      println(lose)
    }
  }
}
