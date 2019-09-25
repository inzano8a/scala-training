package lectures.part1basics

object Expressions extends App
{
  val x = 1 + 2 //expression

  var aVariable = 2
  aVariable += 3 //alfo -= *= /=      side effects


  //Instructions (Do) vs Expressions(Value)

  //IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3  //IF Expression

  println(aConditionedValue)
  println(if (aCondition) 5 else 3)


  var i = 0

  while (i < 10)
  {
    println(i)
    i += 1
  }

  //NEVER WRITE THIS AGAIN!!

  //EVERYTHING in Sacala is an Expression

  val aWeirdValue = (aVariable = 3) // Unit === void

  println(aWeirdValue)

  val aWhile = while (i < 10)
  {
    println(i)
    i += 1
  }

  //sied effects: println(), whiles, reassigning


  //Code blocks

  val aCodeBlock =
  {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "bye"
  }

  println(aCodeBlock)



}
