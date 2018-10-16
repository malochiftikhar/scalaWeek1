package Garage

object Main {

  def main(args: Array[String]): Unit = {
    val car1 = new Car (1, 2007, "iftikhar", "Skoda", "green", "Car", 5)
    val car2 = new Car (2, 2007, "Darle", "Skoda", "green", "Car", 5)
    val nelvin = new Employee("Nelvin", "Jospeh", 21)

    val garage = new Garage
    garage.addVehicle(car1)
    garage.addVehicle(car2)

    garage.contentsOfTheGarage()
    garage.removeVehicle(1)
    garage.contentsOfTheGarage()
    garage.registerEmployee(nelvin)
    garage.getAllEmployees()
  }
}
