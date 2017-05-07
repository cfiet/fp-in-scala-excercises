object Ex26 extends App {
  def treeMax (t: Tree[Int]): Int =
    t match {
      case Leaf(v) => v
      case Branch(l, r) => treeMax(l).max(treeMax(r))
    }

  println(treeMax(Leaf(10)))
  println(treeMax(Branch(Leaf(0), Leaf(1))))
  println(treeMax(Branch(Branch(Leaf(0), Leaf(1)), Branch(Leaf(2), Leaf(3)))))
}
