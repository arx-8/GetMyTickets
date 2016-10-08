package example

import java.io.{FileInputStream, FileNotFoundException}
import java.util.Properties

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

  /**
    * 規定の書式でなければException
    *
    * @param key
    * @return
    */
  def getPropertyStrict(key: String): String = {
    val v = Option(prop.getProperty(key))
    v match {
      case None => {
        initPropFile
        throw new NoSuchElementException("設定ファイルの書式異常。 '%s' がない。".format(key))
      }
      case Some(v) => v
    }
  }
}