package Exercises

import scala.util.Random

object RockPaperScissors {

  def main(args: Array[String]): Unit = {

    var userScore = 0
    var computerScore = 0
    var drawGame = 0

//    var score = "" + userScore + " " + computerScore + " " + drawGame + " "

    while (true) {
      val s = gamePlay();

      if (s.equals("You won!")){
        userScore += 1
      } else if (s.equals("You lose")){
        computerScore += 1
      } else {
        drawGame += 1
      }
      println(userScore + " " + computerScore + " " + drawGame + " ")
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
      case  "Rock"  => "Rock"
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

  def gamePlay () : String = {

    val win = "You won!"
    val lose = "You lose"

    val user1 = userMove()
    val ai = computerMove()
    println(ai)

    if(user1 == ai) {
      println("Draw")
      "Draw"
    } else if (user1.equals("Rock") && ai.equals("Scissors")) {
      println(win)
      win
    } else if (user1.equals("Paper") && ai.equals("Rock")) {
      println(win)
      win
    } else if (user1.equals("Scissors") && ai.equals("Paper")) {
      println(win)
      win
    } else {
      println(lose)
      lose
    }
  }
}
