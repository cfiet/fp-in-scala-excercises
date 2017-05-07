object Ex19 extends App {
  def filter[T] (l: List[T]) (f: T => Boolean): List[T] =
    Ex10.foldLeft (l) (identity[List[T]](_)) ((i, cb) =>
      (rem) => {
        if (f(i))
          cb(i :: rem)
        else
          cb(rem)
      }
    )(List[T]())

  println(filter (List.range(0, 10)) (_ % 2 == 0))
}
