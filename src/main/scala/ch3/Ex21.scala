package ch3

object Ex21 extends App {
  def filter[A] (l: List[A]) (pred: A => Boolean): List[A] =
    Ex20.flatMap (l) (i => pred(i) match {
        case true => List(i)
        case false => List()
    })

  println(filter (List.range(0, 10)) (_ % 2 == 0))
}
