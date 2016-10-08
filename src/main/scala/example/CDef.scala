package example

object SizeEnum {

  sealed class Size(val value: String) {
    override def toString: String = value
  }

  case object Big extends Size("大") {
    println("called big constructor")
  }

  case object Middle extends Size("中")

  case object Small extends Size("小") {
    println("called small constructor")
  }

  case object Other extends Size("他")

}
