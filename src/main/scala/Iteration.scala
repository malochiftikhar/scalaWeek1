object Iteration {

  def main(args: Array[String]): Unit = {
    iter("ifti", 2)
  }

  def iter(str : String, times : Int): Unit = {

    for ( i <-0 until times){
      println(str)
    }
  }
}
