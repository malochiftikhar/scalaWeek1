package Garage

import java.util

class Garage {

  val listOfVehicles = new scala.collection.mutable.ArrayBuffer[Vehicle]()
  val listEmployees = new scala.collection.mutable.ArrayBuffer[Employee]()


  def addVehicle(vehicle: Vehicle): Unit = {
    listOfVehicles += vehicle
  }

  def contentsOfTheGarage(): Unit = {
    listOfVehicles.foreach(println)
  }

  def removeVehicle(removeId: Int): Unit = {
    try {
      listOfVehicles.map(v => if (v.id == removeId) listOfVehicles.remove(listOfVehicles.indexOf(v)))
    } catch {
      case _ => 0
    }
  }

  def registerEmployee(employee: Employee): Unit = {
    listEmployees += employee
  }

  def getAllEmployees(): Unit = {
    listEmployees.foreach(println)
  }

  def fixingVehicle(vehicleId: String, cost: Double, isFixed: Boolean): Unit = {}

  def billing(vehicle: Vehicle): Unit = {
    var bill = 0;
    vehicle match {
      case car => bill = 2
      case bike => bill = 1
      case _ => 0
    }
  }

  def isGarageOpen(isOpen: Boolean): Unit = {

    isOpen match {
      case true => true
      case _ => false
    }
  }

}
