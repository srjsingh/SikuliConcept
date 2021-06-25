import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeTest {

	public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\Desktop\\Selenium Jar"
				+ "\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=cHn-4YPaV4I");
		
		//1st create object of screen
		
		Screen s = new Screen();
		
		Pattern pause = new Pattern("E:\\Eclipse_workspace\\SikuliConceptTest\\pauseButton.PNG");
		Pattern play = new Pattern("E:\\Eclipse_workspace\\SikuliConceptTest\\playButton.PNG");
		Pattern mute = new Pattern("E:\\Eclipse_workspace\\SikuliConceptTest\\muteButton.PNG");
		
		s.wait(play, 2000);
		s.click();
		//s.click();
		
		s.wait(pause, 2000);
		s.click();
		//s.click();
		
		s.wait(mute, 2000);
		s.click();
		//s.click();

	}

}
