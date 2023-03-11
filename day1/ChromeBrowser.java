package week1.day1;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

	public static void main(String[] args) {
//		ChromeDriver driver=new ChromeDriver(); 
//		driver.get("http://leaftaps.com/opentaps/control/main");
		//			WebDriver driver=new ChromeDriver(); 
		//	driver.get("http://leaftaps.com/opentaps/control/main");
		////		driver.get("https://www.facebook.com/");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(" http://leaftaps.com/opentaps/control/main");
	}



}
