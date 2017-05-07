import scala.List

object Ex2 extends App {
  def tail(l: List[_]) =
    l match {
      case List() => List()
      case _ :: t => t
    }

  println(tail(List()))
  println(tail(List(1, 2, 3)))
  println(tail(List("oh", "hello", "world")))
}
