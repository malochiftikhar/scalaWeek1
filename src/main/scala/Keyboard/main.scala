package Keyboard

object main {

  def main(args: Array[String]): Unit = {

    val wordList = loadFile()
    val inputFromUser = userInput()


  }

  def loadFile(): Array[String] = {
    val file = scala.io.Source.fromFile("C:\\Users\\Admin\\IdeaProjects\\scala\\src\\main\\scala\\Keyboard\\enable1.txt").getLines().toArray

    //    file.foreach(println)
    file

    //    val listFfile = new scala.collection.mutable.ArrayBuffer[String]()
    //    for (line <- file.getLines())
    //      println("", line.length, line)
    //      file.close()
  }

  def userInput(): Array[String] = {

    val scanner = new java.util.Scanner(System.in)
    println("Enter a number: ")
    while (!scanner.hasNextInt()) {
      println("Please Enter a number: ")
      scanner.nextLine()
    }
    val num = scanner.nextInt()
    println(s"Now enter the $num lines")
    val listStr = new scala.collection.mutable.ArrayBuffer[String]()
    for (i <- 0 until num) {
      listStr += scanner.next()
    }
    println(listStr)
    listStr.toArray
  }

  def compare(userArray : Array[String], listOfWord: Array[String]): String = {

    val listOfArrayThatMatch = new scala.collection.mutable.ArrayBuffer[String]()

//    for (i <-0 until listOfWord.length) {
//    }
  }
}
