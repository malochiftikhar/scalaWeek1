package Garage

abstract class Person(val firstName: String, val lastName: String, val age: Int, jobTitle : String ) {
  override def toString : String = s"Name: $firstName $lastName Age: $age old JobTitle: $jobTitle "

}
