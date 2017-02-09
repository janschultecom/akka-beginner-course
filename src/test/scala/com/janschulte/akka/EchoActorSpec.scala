package com.janschulte.akka

import akka.actor.{ActorSystem, Props}
import akka.testkit.TestActors.EchoActor
import akka.testkit.{ImplicitSender, TestKit}
import org.specs2.mutable.SpecificationLike


class EchoActorSpec extends TestKit(ActorSystem())
  with ImplicitSender with SpecificationLike {

  "The Echo actor" should {
    "reply with the same message" in {

      val echo = system.actorOf(Props[EchoActor])
      val msg = "hello world"

      echo ! msg

      expectMsg(msg) must be_==(msg)
    }
  }
}
