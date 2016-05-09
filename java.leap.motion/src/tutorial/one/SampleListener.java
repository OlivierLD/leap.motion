package tutorial.one;

import com.leapmotion.leap.*;
import utils.Utils;

public class SampleListener extends Listener {

  @Override
  public void onInit(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onInit(controller);
  }

  @Override
  public void onConnect(Controller controller) {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    System.out.println("Connected");
  }

  @Override
  public void onDisconnect(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onDisconnect(controller);
  }

  @Override
  public void onExit(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onExit(controller);
  }

  @Override
  public void onFrame(Controller controller) {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
//  System.out.println("Frame available");
    Frame frame = controller.frame();
    System.out.println(frame.toString());
  }

  @Override
  public void onFocusGained(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onFocusGained(controller);
  }

  @Override
  public void onFocusLost(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onFocusLost(controller);
  }

  @Override
  public void onServiceConnect(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onServiceConnect(controller);
  }

  @Override
  public void onServiceDisconnect(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onServiceDisconnect(controller);
  }

  @Override
  public void onDeviceChange(Controller controller)
  {
    if ("true".equals(System.getProperty("lm.debug", "false")))
      System.out.println("Invoking " + Utils.caller(new Throwable()));
    super.onDeviceChange(controller);
  }
}