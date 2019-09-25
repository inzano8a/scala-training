package lectures.part2oop

object AbstractDataTypes extends App
{
  abstract class Animal
  {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal
  {
    override val creatureType: String = "K9"

    def eat: Unit = println("bite bite")
  }


  //traits
  trait Carnivore
  {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore
  {
    val creatureType: String = "Croc"
    def eat: Unit = println("big bite")
    def eat(animal: Animal): Unit = println("eat animal")
  }


  //traits vs abstract classes
  //1. traits do not have constructor parameters
  //2. multiple traits may be inherited by the same class
  //3. traits = behavior
}
