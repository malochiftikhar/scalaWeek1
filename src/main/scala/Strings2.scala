object Strings2 {

  def main(args: Array[String]): Unit = {
    stringsTwo("Ha", "llo", 'a', 'e')
  }

  def stringsTwo (str1 : String, str2 : String, char1 : Char, char2 : Char) = {

    var word = str1 + str2
    var newWord = word.replace(char1,char2)

    print(newWord)
  }

}
