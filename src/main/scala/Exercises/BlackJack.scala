package Exercises

object BlackJack {

  def main(args: Array[String]): Unit = {

    twentyOne(1, 1)
  }

  def twentyOne(num1 : Int, num2 : Int) = {

    if (num1 >= 21 && num2 >= 21 || num1 <= 1 && num2 <= 1) {
      println("0")
    } else if (num1 > num2){
        println(num1)
    }else {
      println(num2)
    }
  }
}
