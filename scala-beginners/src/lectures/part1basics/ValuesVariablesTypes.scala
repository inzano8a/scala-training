package lectures.part1basics

object ValuesVariablesTypes extends App
{
  val x: Int = 42

  println(x)

  //Vals are inmutable

  //Compiler cal infer types

  val sString: String = "hello"
  val anotherString = "bye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = 4
  val sShort: Short = 1234
  val aLong: Long = 453454564L
  val aFloat: Float = 2.0f
  val aDouble: Double = 1.2

  //variables
  var aVariable: Int = 4

  aVariable = 5  //side effects
}
