object PatternMatching2 {

  def main(args: Array[String]): Unit = {
    val arrayNum  = Array ("hello","world")
    val tupleNum = new Tuple2("Hello", 2)
    val listNum : List[Any] =  List ("Hello","Ifti")

    swapNumbers(arrayNum)
    swapNumbers(tupleNum)
    swapNumbers(listNum)

  }

  def swapNumbers (ele: Any) = {

    ele match {
//        case any: Array[Int] => any.reverse.foreach(println)
      case ele: Array[Any] => Array(ele(1), ele(0)) foreach println
      case ele: Tuple2[Any, Any] => println(ele._2, ele._1)
      case ele: List[Any] => println(ele.tail.head, ele.head)
      case _ => "Invalid input"
    }
  }
}
