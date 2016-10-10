package example

/**
  * toStringで個別クラス名が取得できる
  */
abstract class Enum {
  def values: List[_]
}

object SizeEnum extends Enum {

  sealed abstract class Size(val value: String)

  case object Big extends Size("大")

  case object Middle extends Size("中")

  case object Small extends Size("小")

  case object Other extends Size("他")

  override def values: List[Size] = List(Big, Middle, Small, Other)
}

object SettingsKeyEnum extends Enum {

  sealed abstract class SettingsKey(val value: String)

  case object BACKLOG_ID extends SettingsKey("backlogId")

  case object BACKLOG_PASSWORD extends SettingsKey("backlogPassword")

  case object BACKLOG_URL extends SettingsKey("backlogUrl")

  case object GOOGLE_ID extends SettingsKey("googleId")

  case object GOOGLE_PASSWORD extends SettingsKey("googlePassword")

  case object GOOGLE_URL extends SettingsKey("googleUrl")

  override def values: List[SettingsKey] = List(BACKLOG_ID, BACKLOG_PASSWORD, BACKLOG_URL, GOOGLE_ID)
}

