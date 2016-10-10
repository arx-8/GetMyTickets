package com.example

import java.io.{FileInputStream, FileNotFoundException}
import java.util.Properties

import com.example.SettingsKeyEnum.SettingsKey

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

  // check
  val missingKeys = SettingsKeyEnum.values.filter(key => prop.getProperty(key.value) == null)
  if (!missingKeys.isEmpty) {
    initPropFile
    val keyNames = missingKeys.map(_.value).mkString(", ")
    throw new NoSuchElementException("設定ファイルの書式異常。 '%s' がない。".format(keyNames))
  }

  def initPropFile: Unit = {
    // TODO
  }

  def get(key: SettingsKey): String = prop.getProperty(key.value)
}
