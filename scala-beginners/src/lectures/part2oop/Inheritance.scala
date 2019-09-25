package lectures.part2oop

object Inheritance extends App
{
  //Single class inheritance
  class Animal
  //final class Animal
  //sealed class Animal
  {
    val creatureType = "Wild"

    def eat = println("....")
    //final def eat = println("....")

    private def otherMethod1 = println("Other1")
    protected def otherMethod2 = println("Other2")
  }

  class Cat extends Animal
  {
    def crunch =
    {
      otherMethod2
      println("crunch")
    }
  }

  val cat = new Cat
  cat.eat
  //cat.otherMethod1
  //cat.otherMethod2
  cat.crunch


  //Constructors
  class Person(name: String, age: Int)
  {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)//, age)


  //Overriding
  class Dog(override val creatureType: String) extends Animal
  {
    //override val creatureType: String = "Canine"
    override def eat: Unit = println("Dog eats")
  }

  val dog = new Dog("K9")
  dog.eat


  //type substitution (polymorphism)
  val unknownAnimal: Animal = new Dog("K9")


  //overRIDING vs overLOADING

  //super

  //preventing overrides
  //1. use 'final' on member
  //2. use 'final' on the entire class
  //3. Seal the class = extend classes in THIS FILE, prevent extension in other files
}
