object Conditionals2 {

  def main(args: Array[String]): Unit = {
    print(sumCond2(2, 3, false))
  }

  def sumCond2(num1 : Int, num2 : Int, bol : Boolean): Int = {

    if (num1 == 0 && num2 == 0) {
      0
    }else if (num1 == 0) {
      num2
    } else if (num2 == 0){
      num1
    }
    if(bol) {
      num1 + num2
    } else {
      num1 * num2
    }
  }
}
