object Ex15 extends App {
  def concatR[A] (l: List[A]) (r: List[A]): List[A] =
    Ch3Utils.foldRight (l) (r) ((i, acc) => i :: acc)

  def concatL[A] (l: List[A]) (r: List[A]): List[A] =
    Ex10.foldLeft (l) ((i: List[A]) => i) ((i, fun) =>
      (a2) => fun(i :: a2)
    )(r)

  def flatten[A] (l: List[List[A]]): List[A] =
    Ex10.foldLeft (l) (identity[List[A]](_)) ((i, cont) =>
      (rem) => cont(concatL (i) (rem))
    )(List[A]())

  println(concatR (List(0, 1, 2)) (List(3, 4, 5)))
  println(concatL (List(0, 1, 2)) (List(3, 4, 5)))
  println(flatten (List(List(0, 1, 2), List(3, 4, 5), List(6, 7, 8))))
}
