package Exercises

object Iteration2 {

  def main(args: Array[String]): Unit = {

    rectangle("H", 4)
  }

  def rectangle(text : String, number : Int): Unit ={

    for (i<- 0 until number){
    for (i<-0 until number) {
      print(text)
    }
      println()
    }
  }
}
