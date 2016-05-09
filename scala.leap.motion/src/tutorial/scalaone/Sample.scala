package tutorial.scalaone

import java.io.IOException

import com.leapmotion.leap.Controller

object Sample {

  def main(args: Array[String]) {
    val listener: SampleListener = new SampleListener
    val controller: Controller = new Controller
    controller.addListener(listener)
    println("Press Enter to quit...")
    try {
      System.in.read
    }
    catch {
      case e: IOException => {
        e.printStackTrace
      }
    }
    controller.removeListener(listener)
  }

}
