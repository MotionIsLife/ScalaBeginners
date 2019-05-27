package chapter3_classAndObject

class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checksum(): Int = ~(sum & 0xFF) + 1

  def addNoCompile(b: Byte): Unit = {
    //b = 1 не пройдет компиляцию, посколько b относится к val-переменным
    sum += b
  }
}
