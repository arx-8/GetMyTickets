package example

/**
  * 例外処理は考えるな
  * コアに集中しろ
  */
object App {
  def main(args: Array[String]): Unit = {
    // debug log の抑制
    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.SEVERE)

    // show
    println(Settings.backlogPassword)
  }
}

