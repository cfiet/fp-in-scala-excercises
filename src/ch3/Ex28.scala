object Ex28 extends App {
  def treeMap[A, B] (t: Tree[A]) (f: (A) => B): Tree[B] =
    t match {
      case Leaf(v) => Leaf(f(v))
      case Branch(l, r) => Branch(treeMap (l) (f), treeMap (r) (f))
    }

  val mul2 = (x: Int) => x*2

  println(treeMap (Leaf(10)) (mul2))
  println(treeMap (Branch(Leaf(0), Leaf(1))) (mul2))
  println(treeMap (Branch(Branch(Leaf(0), Leaf(1)), Branch(Leaf(2), Leaf(3)))) (mul2))
}
