import scala.io.Source

object readFile extends App {
  if(args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines())
      println(line.length + " " + line)
  }
  else
    Console.err.println("Please enter filename")
}
