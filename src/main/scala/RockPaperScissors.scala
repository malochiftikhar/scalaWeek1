import scala.util.Random

object RockPaperScissors {

  def main(args: Array[String]): Unit = {
    while (true) {
      println(gamePlay())
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
      case  "Rock" | "rock" => "Entered Rock"
      case  "Paper" => "You entered Rock"
      case  "Scissors" => "You entered Rock"
      case _ => "Please Enter Rock, Paper or Scissors"
    }
  }

  def computerMove () : String = {
    val moves = Array("Rock", "Paper", "Scissors")
    val rand = new Random((System.currentTimeMillis()))
    val randomMove = rand.nextInt(moves.length)
    val move = moves(randomMove)
    "AI played" + " " + move
  }

  def gamePlay () : String = {

    val win = "You won!"
    val lose = "You lose :D"

    val user1 = userMove()
    val ai = computerMove()

    if (user1.equalsIgnoreCase("Rock") && ai.equalsIgnoreCase("Scissors")) {
      win
    } else if (user1.equalsIgnoreCase("Paper") && ai.equalsIgnoreCase("Rock")) {
      win
    } else if (user1.equalsIgnoreCase("Scissors") && ai.equalsIgnoreCase("Paper")) {
      win
    } else {
      lose
    }
  }

}
