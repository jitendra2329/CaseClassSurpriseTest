package com.knoldus

object Driver extends App {
  private val firstObject = Number("1", isEven = false)
  private val secondObject = Number("2", isEven = true)
  private val thirdObject = Number("3", isEven = false)
  private val fourthObject = Number("4", isEven = true)
  private val fifthObject = Number("5", isEven = false)

  val listOfCaseClassNumber = List(firstObject, secondObject, thirdObject, fourthObject, fifthObject)

  private val numberDriver = NumberDriver

  println("list of even values : " + numberDriver.getEvenValues(listOfCaseClassNumber))
  println("list of even values : " + numberDriver.getOddValues(listOfCaseClassNumber))
  println("partition of List[Number] based on even and odd behavior : " + numberDriver.partitions(listOfCaseClassNumber))

}
