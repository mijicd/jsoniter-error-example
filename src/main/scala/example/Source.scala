package example

sealed trait Source

object Source {
  case object A extends Source
  case object B extends Source
  case object C extends Source
}
