package example.adapter

import example.Const
import org.openqa.selenium.By
import org.openqa.selenium.htmlunit.HtmlUnitDriver

class BacklogAdapter {
  // init
  val driver = new HtmlUnitDriver() {
    get(Const.URL_BACKLOG)
    findElement(By.cssSelector("NAME")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).sendKeys("TODO")
    findElement(By.cssSelector("PASSWD")).click
  }
}