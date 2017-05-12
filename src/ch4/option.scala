package ch4

sealed trait Option[+A] {
  def map[B] (f: A => B): Option[B] =
    this match {
      case Some(v) => Some(f(v))
      case None => None
    }

  def getOrElse[B >: A] (default: => B): B =
    this match {
      case Some(v) => v
      case None => default
    }

  def flatMap[B] (f: A => Option[B]): Option[B] =
    (this map f) getOrElse None

  def orElse[B >: A] (other: => Option[B]): Option[B] =
    (this map (Some(_))) getOrElse other

  def filter (f: A => Boolean): Option[A] =
    this flatMap (v => if (f(v)) this else None)
}

case class Some[+A](get: A) extends Option[A]
case object None extends Option[Nothing]

object Option {
  def lift[A,B](f: A => B): Option[A] => Option[B] = _ map f

  def sequence[A] (a: List[Option[A]]): Option[List[A]] =
    a.foldRight[Option[List[A]]] (Some(List[A]())) (Ex3.map2(_, _) (_ :: _))
}