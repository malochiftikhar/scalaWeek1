import MethodRecursion.fizbuz

object PatternMatching {

  def main(args: Array[String]): Unit = {

    //    fizbuz("Fizz", "Buzz", 15)

    ptrnOne(0, 3, true)

  }

  //  def patrnMatching(str1 : String, str2 : String, num : Int): Unit = {
  //
  //    val loop = num
  //    if(loop > 0) {
  //    }
  //    loop match {
  //      case loop if(loop % 3 == 0 && loop % 5 == 0) => println(str1 + str2)
  //      case loop if(loop % 3 == 0) => println(str1)
  //      case loop if(loop % 5 == 0) => println(str2)
  //      case _ => println(loop)
  //    }
  //    patrnMatching(str1, str2, loop - 1)
  //  }


  def ptrnOne(num1: Int, num2: Int, bol: Boolean): Unit = {

      num1 match {
        case num1 if (num1 == 0 && num2 == 0) => println(0)
        case num1 if (num1 == 0) => println(num2)
        case num1 if (num2 == 0) => println(num1)
        case num1 if (bol == true) => println(num1 + num2)
        case num1 if (bol == false) => println(num1 * num2)
        case _ => println("BLAH")
      }
  }
}