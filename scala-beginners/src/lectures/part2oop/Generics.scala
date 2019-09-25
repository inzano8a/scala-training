package lectures.part2oop

object Generics extends App
{
  class MyList[A]
  {

  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  object MyList
  {
    def empty[A]: MyList[A] = ???
  }

  val emptyListIntegers = MyList.empty[Int]


  //Variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1. Yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) ?? Hard Question

  //2. No, INVARIANCE
  class InvariantList[A]
  //val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat]//Error
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell, No. CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)
}
