import java.io.{FileInputStream, FileNotFoundException}
import java.util.Properties

object App {
  def main(args: Array[String]): Unit = {
    // debug log の抑制
    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.SEVERE)

    // show
    println(Settings.getValue("id"))
  }
}

object Const {
  // URL
  val URL_BACKLOG = "http://search.yahoo.co.jp/search?p=scala"

  // PATH
  val PATH_SETTINGS_PROPERTIES = "D:\\Project\\IdeaProjects\\settings.properties"
}

object Settings {
  val p = new Properties()

  try {
    val fis = new FileInputStream(Const.PATH_SETTINGS_PROPERTIES)
    p.load(fis)
    fis.close()
  } catch {
    case e: FileNotFoundException =>
      // TODO make default file
      println(e.getMessage)
  }

  def getValue(key: String): String = p.getProperty(key, "")
}