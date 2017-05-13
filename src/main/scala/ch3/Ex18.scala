package ch3

object Ex18 extends App {
  def map[A, B] (l: List[A]) (f: (A => B)): List[B] =
    Ex10.foldLeft (l) (identity[List[B]](_)) ((i, cont) =>
      (rem) => cont(f(i) :: rem)
    )(List[B]())

  println(map (List.range(0, 10)) (2 *))
  println(map (List.range(0, 10)) (100 +))
}
