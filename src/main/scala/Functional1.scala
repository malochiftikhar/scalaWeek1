object Functional1 {

  def main(args: Array[String]): Unit = {

    fun().foreach(element => println(element(1)))
    // the 1 is calling the second elememt in the array
  }

  def fun ()   = {
    java.util.TimeZone.getAvailableIDs.map(value => value.split("/")).filter(_.size >= 2).flatMap(_.toList).distinct.grouped(10)
  }
}