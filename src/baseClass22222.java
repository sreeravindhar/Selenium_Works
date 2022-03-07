import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseClass22222 {
	public static WebDriver driver;
	

	public static void browserlaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"A:\\My data\\Java\\NewSeleniumProject\\Driver\\chromedriver.exe");
		              driver = new ChromeDriver();
		              driver.manage().window().maximize();
			
			
			
		}else if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", 
					"A:\\My data\\Java\\NewSeleniumProject\\Driver\\msedgedriver.exe");
		              driver = new EdgeDriver();
		              driver.manage().window().maximize();
			
			
		}else {
			System.out.println("invalid browser");
		}
		
	

	}

}
