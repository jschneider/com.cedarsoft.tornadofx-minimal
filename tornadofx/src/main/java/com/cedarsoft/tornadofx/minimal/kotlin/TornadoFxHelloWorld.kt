package com.cedarsoft.tornadofx.minimal.kotlin

import tornadofx.*

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
class TornadoFxHelloWorld : App(HelloWorldView::class) {
}

class HelloWorldView : View() {
  override val root = hbox {
    label("Hello World")
  }
}
