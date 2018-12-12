package models

import scala.math._

class Circle(radius: Double) {

  import Circle._

  def area: Double = calculateArea(radius)
}

//One of the most common uses of a companion object is to define factory methods for class
object Circle {
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)


}

