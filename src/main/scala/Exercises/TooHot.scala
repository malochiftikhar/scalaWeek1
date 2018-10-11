package Exercises

object TooHot {

  def main(args: Array[String]): Unit = {

    println(season(100, true))
  }

  def season(temp: Int, isSummer: Boolean): Boolean = {

    isSummer match {
      case true if temp >= 60 && temp <=100 => true
      case false if temp >= 60 && temp <=90 => true
      case _ => false
    }
  }
}
