package com.janschulte.akka

import akka.actor.Actor.Receive
import akka.actor.{Actor, ActorSystem, Props}

class NiceGuy extends Actor {

  override def receive: Receive = {
    case name =>
      println(s"Hello $name")

  }
}

object HelloWorld extends App {


  val system = ActorSystem("HelloSystem")

  val niceGuy = system.actorOf(Props[NiceGuy],"niceguy")

  niceGuy ! "Jan"

  //val ref = system.actorSelection("/user/niceguy")

  //ref ! "Mr. Wong"

}
