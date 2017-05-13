import scala.collection.immutable

package object ch5 {
  sealed trait Stream[+A] {
    def toList: List[A] = {
      this match {
        case Empty => List.empty[A]
        case Cons(h, t) => h() :: t().toList
      }
    }

    def take (n: Int): Stream[A] =
      this match {
        case Empty => empty
        case Cons(h, t) => if (n == 0) empty else Cons[A](h, () => t().take(n-1))
      }

    def drop (n: Int): Stream[A] =
      this match {
        case Empty => Empty
        case Cons(h, t) => if (n == 0) Cons(h, t) else t().drop(n-1)
      }

    def takeWhile (p:A => Boolean): Stream[A] =
      this match {
        case Empty => Empty
        case Cons(h, t) => if (!p(h())) Empty else Cons[A](h, () => t().takeWhile(p))
      }

    def foldRight[B] (z: => B) (f:(A, => B) => B) :B =
      this match {
        case Empty => z
        case Cons(h, t) => f(h(), t().foldRight (z) (f))
      }

    def forAll (p: A => Boolean): Boolean =
      this.foldRight (true) (p(_) && _)
  }
  case object Empty extends Stream[Nothing]
  case class Cons[+A](head: () => A, t: () => Stream[A]) extends Stream[A]

  def cons[A](head: => A) (tail: => Stream[A]): Stream[A] = {
    lazy val h = head
    lazy val t = tail
    Cons(() => h, () => t)
  }

  def empty[A]: Stream[A] =
    Empty

  def apply[A](as: A*): Stream[A] =
    if (as.isEmpty) empty else cons (as.head) (apply (as.tail: _*))
}
