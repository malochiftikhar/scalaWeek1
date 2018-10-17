package Garage

class Part (val vehicleId : Int, val broken : Boolean, val partName : String, val costOfPart : Double) {

  override def toString : String = s"Part : $partName $broken $costOfPart $vehicleId"
}
