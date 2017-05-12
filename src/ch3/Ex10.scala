package ch3

object Ex10 extends App {
  def foldLeft[A, B] (l: List[A]) (acc: B) (f: (A, B) => B): B =
    l match {
      case Nil => acc
      case h :: t => foldLeft (t) (f (h, acc) ) (f)
    }

  println(foldLeft (List[Int]()) (0) (_ + _))
  println(foldLeft (List(0, 1, 2, 3)) (0) (_ + _))
  println(foldLeft (List.range(0, 10)) (0) (_ + _))
}
