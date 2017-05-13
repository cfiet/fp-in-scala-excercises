package ch4

object Ex4 extends App {
  println(Option.sequence (List.range(0, 10).map(Some(_))))
  println(Option.sequence (List(Some(0), None)))
}