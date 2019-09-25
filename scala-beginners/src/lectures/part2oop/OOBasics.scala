package lectures.part2oop

object OOBasics extends App
{
  val person = new Person("JJ", 38)

  println(person)
  println(person.age)
  println(person.x)

  person.greet("Daniel")


  val author = new Writer("Charles", "Dickens", 1812)
  val impostor = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(impostor))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

class Person(name: String, val age: Int = 0)//constructor
{
  val x = 2

  //class parameter are not fields

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("JJ 8a")
}


class Writer(firstName: String, surName: String, val year: Int)
{
  def fullName: String = firstName + " " + surName
}

class Novel(name: String, year: Int, author: Writer)
{
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0)
{
  def inc = new Counter(count + 1) //inmutability
  def dec = new Counter(count - 1)

  def inc(n: Int): Counter =
  {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter =
  {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}