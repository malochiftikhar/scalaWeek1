package Slick
import slick.jdbc.MySQLProfile.api._

class TestTable (tag: Tag) extends Table [(Int, String, Int)] (tag, "Testtable") {
  def id = column[Int] ("id", O.PrimaryKey, O.AutoInc)
  def name =column[String] ("name")
  def age = column[Int] ("age")
  def * = (id, name, age)
}
