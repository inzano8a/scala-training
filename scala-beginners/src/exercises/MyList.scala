package exercises

abstract class MyList
{
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList
{
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Cons(element, Empty)
  def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList
{
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element, this)
  def printElements: String =
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
}

object ListText extends App
{
  val list = new Cons(1, Empty)

  println(list.head)
  println(list.add(4).head)
  println(list.isEmpty)
  println(list)
}