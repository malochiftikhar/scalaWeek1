object BlackJack {

  def main(args: Array[String]): Unit = {

    twentyOne(18, 21)
  }

  def twentyOne(num1 : Int, num2 : Int) = {

    if (num1 > 21 && num2 > 21) {
      println("0 Both numbers are the same")
    } else if (num1 < 1 && num2 < 1) {
      println(" 0 Both numbers are the same")
    } else if (num1 > 21 && num2 <= 21 && num2 > 0) {
      println(num2)
    } else if (num1 > 21 && num2 <= 21 && num2 > 0) {
      println(num1)
    } else if (num1 > num2 && num2 <= 21 && num2 > 0) {
      println(num1)
    } else if (num1 > num1 && num2 <= 21 && num2 > 0) {
      println(num2)
    } else if (num1 < 21 && num2 == 21) {
      println(num2)
    } else{
      println("Not valid input")
    }
  }
}
