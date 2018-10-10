import MethodRecursion.fizbuz

object PatternMatching {

  def main(args: Array[String]): Unit = {

    fizbuz("Fizz", "Buzz", 15)

  }

  def patrnMatching(str1 : String, str2 : String, num : Int): Unit = {

    val loop = num
    if(loop > 0) {
    }
    loop match {
      case loop if(loop % 3 == 0 && loop % 5 == 0) => println(str1 + str2)
      case loop if(loop % 3 == 0) => println(str1)
      case loop if(loop % 5 == 0) => println(str2)
      case _ => println(loop)
    }
    patrnMatching(str1, str2, loop - 1)
  }
}