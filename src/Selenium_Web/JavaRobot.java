package Selenium_Web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class JavaRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		Robot r = new Robot();
	r.mouseMove(300, 300);
		Thread.sleep(3000);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	
		
//       r.keyPress(KeyEvent.VK_ENTER);	
//       r.keyRelease(KeyEvent.VK_ENTER);
//       
       
				

	}

}
