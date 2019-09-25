package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App
{
  //@tailrec
  def factorial(n: Int): Int =
  {
    if (n <= 0) 1
    else
    {
      println("Computing factorial of " + n + ", I first need factorial of " + (n - 1))
      var result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(10))
  //println(factorial(5000))


  def anotherFactorial(n: Int): Int =
  {
    @tailrec
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //Tail recursion

    factHelper(n, 1)
  }

  println(anotherFactorial(5000))

  //WHEN YOU NEED LOOPS USE _TAIL_ RECURSION

  @tailrec
  def concatenate(aString: String, n: Int, accumulator: String): String =
  {
    if (n <= 0) accumulator
    else concatenate(aString, n - 1, aString + accumulator)
  }

  println(concatenate("Hello", 3, ""))
}
