package tutorial.javaone;

import com.leapmotion.leap.*;

import java.io.IOException;

public class Sample {
  public static void main(String[] args) {
    // Create a sample listener and controller
    SampleListener listener = new SampleListener();
    Controller controller = new Controller();
    controller.addListener(listener);
    // Keep this process running until Enter is pressed
    System.out.println("Press Enter to quit...");
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Remove the sample listener when done
    controller.removeListener(listener);
  }
}
