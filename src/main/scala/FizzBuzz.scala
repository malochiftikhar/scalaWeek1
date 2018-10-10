object FizzBuzz {

  def main(args: Array[String]): Unit = {

    fizbuz("Fizz", "Buzz", 15)
  }

  def fizbuz(str1 : String, str2 : String, num : Int): Unit ={

    for(i <- 1 until num) {
      if(i % 3 == 0 && i % 5 == 0) {
        print(str1 + str2)
      }else if(i % 3 == 0){
        print(str1)
      } else if (i % 5 == 0) {
        print(str2)
      } else {
        print(i)
      }
    }
  }
}
