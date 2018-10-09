object Conditionals {

  def main(args: Array[String]): Unit = {
    print(sumCond(2, 3, false))
  }

  def sumCond(num1 : Int, num2 : Int, bol : Boolean): Int = {
    if(bol) {
      num1 + num2
    } else {
      num1 * num2
    }
  }
}
