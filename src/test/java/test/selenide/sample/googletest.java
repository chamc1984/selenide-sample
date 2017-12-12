package test.selenide.sample;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.Test;
import org.openqa.selenium.By;

public class googletest {

	@Test
	public void userCanLoginByUser() {
		open("https://www.google.com");
		$("#lst-ib").val("selenide").pressEnter();
		$(By.linkText("Selenide: concise UI tests in Java")).click();
		$("body").shouldHave(text("What is Selenide?"));
	}
}
