object TypeInference {
  def main(args: Array[String]): Unit = {

    tI("Hello")
    tI(1)
    tI(1.2)
    tI(false)
  }

  def tI (any: Any) : Unit = {
    println(any)
  }
}
