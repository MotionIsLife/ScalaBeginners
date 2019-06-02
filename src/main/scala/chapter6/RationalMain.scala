package chapter6

object RationalMain {
  def main(args: Array[String]): Unit = {
    val rational1 = new Rational(10,2)
    val rational2 = new Rational(2,3)
    println(rational1 add rational2)
    println(rational1.number)
    println(rational1.denom)
    println(rational1.max(rational2))
    println(rational1)
    println("rational1 + rational2 = " + (rational1 + rational2))
    println("rational1 * rational2 = " + (rational1 * rational2))
    println("rational2 * 2 = " + (rational2 * 2))
    implicit def intToRational(x: Int) = new Rational(x)
    println(4 * rational1)
  }
}
