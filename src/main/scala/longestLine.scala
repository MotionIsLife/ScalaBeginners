import scala.io.Source

object longestLine extends App {
  if(args.length > 0) {
    val lines = Source.fromFile(args(0)).getLines().toList
    println(lines)
    val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
    println(longestLine)
    println(widthOfLength(longestLine))
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }
  }
  else
    Console.err.println("Please enter filename")

  def widthOfLength(s: String) = s.length.toString.length

}
