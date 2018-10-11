package Exercises

object Strings {
  def main(args: Array[String]): Unit = {

    println(twoPara("Hello", 3))
  }

  def twoPara(text : String , number : Int ) = {

    text.takeRight(number)
  }
}
