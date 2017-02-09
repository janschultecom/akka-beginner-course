package com.janschulte.akka.examples

import akka.actor.Actor
import akka.actor.Actor.Receive

class EchoActor extends Actor{
  override def receive: Receive = {
    case msg => sender() ! msg
  }
}
