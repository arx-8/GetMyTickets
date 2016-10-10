package example.adapter

import example.{Settings, SettingsKeyEnum}
import org.openqa.selenium.By
import org.openqa.selenium.htmlunit.HtmlUnitDriver

class BacklogAdapter {
  // init
  val driver = new HtmlUnitDriver() {
    get(Settings.get(SettingsKeyEnum.BACKLOG_URL))
    findElement(By.cssSelector("NAME")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).click
  }
}
