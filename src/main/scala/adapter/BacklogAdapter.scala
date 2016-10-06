package adapter

import org.openqa.selenium.By
import org.openqa.selenium.htmlunit.HtmlUnitDriver

object BacklogAdapter {
  // init
  val driver = new HtmlUnitDriver() {
    get(Const.URL_BACKLOG)
    findElement(By.cssSelector("NAME")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).click
  }
}