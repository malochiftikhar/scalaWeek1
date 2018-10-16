package Garage

class Employee(firstName : String, lastName : String, age : Int) extends Person(firstName, lastName, age){

  override def toString : String = s"Name: $firstName $lastName and is $age years old"

}
