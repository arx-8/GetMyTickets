package example.adapter

import example.Settings
import org.openqa.selenium.By
import org.openqa.selenium.htmlunit.HtmlUnitDriver

class BacklogAdapter {
  // init
  val driver = new HtmlUnitDriver() {
    get(Settings.urlBacklog)
    findElement(By.cssSelector("NAME")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).click
  }
}
