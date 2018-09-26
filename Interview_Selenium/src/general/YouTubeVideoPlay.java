package general;



	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class YouTubeVideoPlay {
		
		@Test
	    public void test1() throws InterruptedException {
	        //Initialising the Chrome driver
			System.setProperty("webdriver.chrome.driver",  "C:\\Test_Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        //navigating to the below url 
	        driver.get("https://www.youtube.com/watch?v=qxoXvn2l2gA");

	        Thread.sleep(5000L);

	        WebElement video = driver.findElement(By.tagName("video"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	         //pausing the video
	        js.executeScript("arguments[0].pause();", video);

	        Thread.sleep(5000L);

	//playing the video         
	js.executeScript("arguments[0].play();", video);
	        Thread.sleep(5000);
	/*
	//muting the video          
	js.executeScript("arguments[0].mute();", video);
	        Thread.sleep(5000L);

	//unmuting the video            
	js.executeScript("arguments[0].unMute();", video);
	        Thread.sleep(5000L);*/

	//Dragging the video            
	js.executeScript("arguments[0].currentTime = 600;", video);
	        Thread.sleep(5000L);

	        js.executeScript("alert(arguments[0].readyState);", video);

	        driver.quit();
		
		
	}

}
