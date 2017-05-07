object Ex20 extends App {
  def flatMap[A, B] (l: List[A]) (f: A => List[B]): List[B] =
    Ex15.flatten (Ex18.map (l) (f))

  println(flatMap (List.range(0, 10)) ((i: Int) => List(i, i*i, i*i*i)))
}

