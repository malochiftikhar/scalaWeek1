package Exercises

object UniqueSum {

  def main(args: Array[String]): Unit = {

    sumOfUniqueNum(3,1,2)
  }

  def sumOfUniqueNum ( num1 : Int , num2 : Int, num3 : Int): Unit = {


    if (num1 != num2 && num1 != num3 && num2 != num3){
      val sum = num1 + num2 + num3
      println(sum)
    }else if (num1 == num2 && num2 == num3 ) {
      println(0)
    } else if (num1 == num2 && num2 != num3) {
      println(num3)
    } else if (num1 != num2 && num2 == num3) {
      println(num1)
    } else if (num1 == num3 && num2 != num3) {
      println(num2)
    } else {
      println("You have not entered a number")
    }
  }
}
