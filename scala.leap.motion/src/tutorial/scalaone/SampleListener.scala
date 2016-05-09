package tutorial.scalaone

import com.leapmotion.leap.{ Controller, Frame, Listener }

import utils.Utils

class SampleListener extends Listener {
  override def onInit(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onInit(controller)
  }

  override def onConnect(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    println("Connected")
  }

  override def onDisconnect(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onDisconnect(controller)
  }

  override def onExit(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onExit(controller)
  }

  override def onFrame(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    val frame: Frame = controller.frame
    println(frame.toString)
  }

  override def onFocusGained(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onFocusGained(controller)
  }

  override def onFocusLost(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onFocusLost(controller)
  }

  override def onServiceConnect(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onServiceConnect(controller)
  }

  override def onServiceDisconnect(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onServiceDisconnect(controller)
  }

  override def onDeviceChange(controller: Controller) {
    if ("true" == System.getProperty("lm.debug", "false")) println("Invoking " + Utils.caller(new Throwable))
    super.onDeviceChange(controller)
  }
}