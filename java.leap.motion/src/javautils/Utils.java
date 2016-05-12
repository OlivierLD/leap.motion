package javautils;

import com.leapmotion.leap.*;

public class Utils {
  public static String caller(Throwable t)
  {
    return t.getStackTrace()[0].toString();
  }

  public static void frameDump(Frame frame) {
    System.out.printf("id: %d, timestamp:%d\n", frame.id(), frame.timestamp());
    InteractionBox ib = frame.interactionBox();
    if (ib != null) {
      Vector center = ib.center();
      System.out.printf("Center x:%.2f y:%.2f z:%.2f\n", center.getX(), center.getY(), center.getZ());
      System.out.printf("Size   w:%.3f, h:%.3f, d:%.3f\n", ib.width(), ib.height(), ib.depth());
    }
    HandList handList = frame.hands();
    if (handList != null) {
      System.out.printf("%d hand(s)\n", handList.count());
    }
  }
}
