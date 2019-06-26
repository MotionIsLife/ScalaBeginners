package scalaBook2.chapter5

object NetworkMain {
  def main(args: Array[String]): Unit = {
    val chatter = new Network
    val myFace = new Network

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    fred.contacts += wilma
    val barney = myFace.join("Barney")
    //fred.contacts += barney
  }
}
