package org.stockwatcher

import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

class HelloWorldConfig(ctx: GenericApplicationContext) {
  init {
    beans {
      bean<HelloWorld>()
    }.initialize(ctx)
  }
}