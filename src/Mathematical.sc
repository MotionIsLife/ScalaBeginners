import scala.collection.convert.WrapAsJava.asJavaCollection
import scala.collection.immutable.HashSet

def square(x: Int) = x * x

square(5)

1 + 50

res0 + res1

println("Hello, world111")

val msg = "hello, world!"
println(msg)
//msg = "Goodbye" error. Final variable

var greeting = "Hello"
println(greeting)
greeting = "New hello"
println(greeting)

def max(x: Int, y: Int): Int = {
  if(x > y) x
  else y
}

max(9, 5)

def maxShort(x: Int, y: Int) = if (x > y) x else y

maxShort(2, 4)

def greet() = println("Hello")

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2)
  print(greetStrings(i))

1 + 2

(1).+(2)

val numNames = Array("zero", "one", "two")
val numNamesApply = Array.apply("zero", "one", "two")

val oneTwoThree = List(1, 2, 3)
val fourFive = List(4, 5)
val oneTwoThreeFourFive = oneTwoThree :::  fourFive
println(oneTwoThree + " and " + fourFive + " were not mutated. ")
println("Thus, " + oneTwoThree + " is a new list.")

val twoThree = List(2, 3)
val oneTwoFive = 1 :: twoThree; //:: произносится как конс (cons)
println(oneTwoFive)


val oneTwoThreeNil = 1 :: 2 :: 3 :: Nil
println(oneTwoThreeNil)


val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)

//списки - неизменяемы
//массивы - изменяемы


var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

jetSet += "Lear" //создается и присваивается новый Set
println(jetSet.contains("Lear"))


import scala.collection.mutable
val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)


import scala.collection.immutable.HashSet
val immutableHashSet = HashSet("Tomatoes", "Chilies")
println(immutableHashSet + "Coriander")


import scala.collection.mutable
val treasureMap = mutable.Map[Int, String] ()
treasureMap += (1 -> "Go to osland.")
treasureMap += (2 -> "Find big X on ground..")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))


val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III")//immutable
println(romanNumeral(3))