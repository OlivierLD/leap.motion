package utils;

public class Utils
{
  public static String caller(Throwable t)
  {
    return t.getStackTrace()[0].toString();
  }
}
