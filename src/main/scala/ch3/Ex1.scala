package ch3

object Ex1 extends App {
  def sum(l: List[Int]): Int =
    l.foldLeft (0) (_ + _)

  val x = List(1,2,3,4,5) match {
    case x :: 2 :: 4 :: _ => x
    case Nil => 42
    case x :: y :: 3 :: 4 :: _ => x + y // <-
    case h :: t => h + sum(t)
    case _ => 101
  }

  println(x)
}
