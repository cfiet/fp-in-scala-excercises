package ch3

object Ex5 extends App {
  def dropWhile[A](l: List[A], p: A => Boolean): List[A] =
    if (l.length == 0 || p(l.head))
      l
    else
      dropWhile(l.tail, p)


  println(dropWhile[Int](List.range(0, 10), 5 <=))
}
