package com.knoldus

case class Number(number: String, isEven: Boolean)

object NumberDriver {
  def getEvenValues(listOfCaseClassNumber: List[Number]): List[String] = {
    val evenValuesOfList = listOfCaseClassNumber.filter(_.isEven)
    evenValuesOfList.map(_.number)
  }

  def getOddValues(listOfCaseClassNumber: List[Number]): List[String] = {
    val oddValuesOfList = listOfCaseClassNumber.filterNot(_.isEven)
    oddValuesOfList.map(_.number)
  }

  def partitions(listOfCaseClassNumber: List[Number]): (List[Number], List[Number]) = {
    listOfCaseClassNumber.partition(_.isEven)
  }
}
