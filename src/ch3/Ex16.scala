object Ex16 extends App {
  def addOne (l: List[Int]) =
    Ex10.foldLeft (l) ((i: List[Int]) => i) ((i, fun) =>
      (a2) => fun(i+1 :: a2)
    )(List[Int]())

  println(addOne(List(0,1,2,3)))
}
