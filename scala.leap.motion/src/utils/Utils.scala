package utils

object Utils {
  def caller(t: Throwable): String = {
    return t.getStackTrace()(0).toString
  }
}
