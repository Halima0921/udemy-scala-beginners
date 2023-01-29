package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER can infer types so we don't need to write it

  val aString: String = "hello"
  val anotherString = "Halima"

  val aBoolean: Boolean = false
  val aChar: Char = 'H'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 85654855L
  val aFloat: Float = 5.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 9

  aVariable = 5 //side effects
}