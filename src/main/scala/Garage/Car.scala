package Garage

class Car(id: Int, year: Int, owner: String, brand: String, colour: String, vehicleType: String, val numberDoors: Int) extends
  Vehicle(id, year, owner, brand, colour, vehicleType) {

  override def toString: String = s"Car: $id $owner"

}
