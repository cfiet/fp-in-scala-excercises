object Ex27 extends App {
  def treeDepth (t: Tree[_]): Int =
    t match {
      case Leaf(_) => 1
      case Branch(l, r) => 1 + treeDepth(l).max(treeDepth(r))
    }

  println(treeDepth(Leaf(10)))
  println(treeDepth(Branch(Leaf(0), Leaf(1))))
  println(treeDepth(Branch(Branch(Leaf(0), Leaf(1)), Branch(Leaf(2), Leaf(3)))))
}
