package ch3

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

object Ch3Utils {
  def foldRight[A, B](l: List[A])(acc: B)(f: (A, B) => B): B =
    l match {
      case Nil => acc
      case h :: t => f(h, foldRight (t) (acc) (f))
    }
}
