import scala.io.Source

object maxWidth extends App {
  if(args.length > 0) {
    val lines = Source.fromFile(args(0)).getLines().toList
    println(lines)
    var maxWidth = 0
    for(line <- lines)
      maxWidth = maxWidth.max(widthOfLength(line))
    println(maxWidth)
  }
  else
    Console.err.println("Please enter filename")

  def widthOfLength(s: String) = s.length

}
