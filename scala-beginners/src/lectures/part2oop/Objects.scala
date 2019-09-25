package lectures.part2oop

object Objects// extends App
{
  //SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")

  //Objects do not have constructors
  object Person
  {
    //"static"/class level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    //Factory method
    def from(father: Person, mother: Person): Person = new Person("Bobbie")
    def apply(father: Person, mother: Person): Person = new Person("Bobbie")
  }

  class Person(name: String)
  {
    //instance level functionality
  }

  //object & class Person are called Companions


  println(Person.N_EYES)
  println(Person.canFly)

  //Scala Objects = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary)
  println(john)

  val bobbie = Person.from(john, mary)
  val other1 = Person.apply(john, mary)
  val other2 = Person(john, mary)


  //Scala Applications = Scala Object with
  //def main(args: Array[String]): Unit

  def main(args: Array[String]): Unit =
  {
    println("Runnable code")
  }
}
