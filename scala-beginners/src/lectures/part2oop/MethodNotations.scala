package lectures.part2oop

object MethodNotations extends App
{
  class Person(val name: String, favoriteMovie: String, val age: Int = 0)
  {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname", favoriteMovie)

    def unary_! : String = s"$name what the heck!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive(): Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String): String = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val marie = new Person("Marie", "Inception")

  println(marie.likes("Inception"))
  println(marie likes "Inception") //equivalent
  //infix notation = operator notation (syntactic sugar)
  //only for methods with 1 parameter

  //"operators"
  val tom = new Person("Tom", "Fight Club")
  println(marie hangOutWith tom)
  println(marie + tom)
  println(marie.+(tom))

  //ALL OPERATOR ARE METHODS


  //prefix notation
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_ prefix only works with - + ~ !

  println(! marie)
  println(marie.unary_!)


  //postfix notation
  println(marie.isAlive)
  //println(marie isAlive)


  //apply
  println(marie.apply())
  println(marie())

  println((+marie).age)
}
