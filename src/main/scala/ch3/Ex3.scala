package ch3

object Ex3 extends App {
  def setHead[A] (l: List[A], i: A): List[A] =
    l match {
      case Nil | List() => i :: l
      case _ :: t => i :: t
    }

  println(setHead(List(2, 3, 4, 5, 6), 1))
  println(setHead(List("two", "three"), "one"))
  println(setHead(List(), 0))
}
