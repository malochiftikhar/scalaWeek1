object MethodRecursion {
  def main(args: Array[String]): Unit = {

    fizbuz("Fizz", "Buzz", 15)
  }

  def fizbuz(str1 : String, str2 : String, num : Int): Unit ={

      val i = num
      if(i > 0) {
        if(i % 3 == 0 && i % 5 == 0) {
          print(str1 + str2)
        }else if(i % 3 == 0){
          print(str1)
        } else if (i % 5 == 0) {
          print(str2)
        } else {
          print(i)
        }
        fizbuz(str1, str2, i - 1)
      }
  }
}
