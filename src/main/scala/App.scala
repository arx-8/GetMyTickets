import java.io.{FileInputStream, FileNotFoundException}
import java.util.Properties

/**
  * 例外処理は考えるな
  * コアに集中しろ
  */
object App {
  def main(args: Array[String]): Unit = {
    // debug log の抑制
    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.SEVERE)

    // show
  }
}

object Settings {
  // read
  private val prop = new Properties()
  try {
    val fis = new FileInputStream(Const.PATH_SETTINGS_PROPERTIES)
    prop.load(fis)
    fis.close()
  } catch {
    case e: FileNotFoundException =>
      initPropFile
      throw e
  }

  // set
  val backlogId = getPropertyStrict("backlogId")
  val backlogPassword = getPropertyStrict("backlogPassword")
  //  val gitHubId = getPropertyStrict("gitHubId")
  //  val gitHubPassword = getPropertyStrict("gitHubPassword")
  //  val redmineId = getPropertyStrict("redmineId")
  //  val redminePassword = getPropertyStrict("redminePassword")

  def initPropFile: Unit = {
    // TODO
  }

  def getPropertyStrict(key: String): String = {
    val v = prop.getProperty(key)
    if (v == null) {
      throw new NoSuchFieldException("key : " + key)
    }
    return v
  }
}