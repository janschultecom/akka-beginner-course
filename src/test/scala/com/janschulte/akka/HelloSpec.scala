package com.janschulte.akka

import org.specs2.mutable.Spec

class HelloSpec extends Spec {
  "The Hello object" should {
    "say hello" in {
      true must beTrue
    }
  }
}
