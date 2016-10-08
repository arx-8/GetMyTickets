package example

import example.dto.TicketDto


/**
  * 例外処理は考えるな
  * コアに集中しろ
  */
object App {
  def main(args: Array[String]): Unit = {
    // debug log の抑制
    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.SEVERE)

    // show
    val t = new TicketDto
    t.size = Option(SizeEnum.Big)
    t.size = Option(SizeEnum.Middle)
    t.size = Option(SizeEnum.Big)
    println(t.size.getOrElse("nothing"))

    t.size.get match {
      case SizeEnum.Middle => println("this is mid")
      case SizeEnum.Big => println("BIG")
      case _ => println("not mid")
    }
    println(t.size.get == SizeEnum.Big)
    println(t.size.getClass.toString)
    println(SizeEnum.Small)
  }
}
