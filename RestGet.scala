package org.com.curried

import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.core.MediaType
import javax.ws.rs.client.Entity
import javax.ws.rs.Path
import javax.ws.rs.POST

object RestGet {
  def main(args: Array[String]): Unit = {
    val client = ClientBuilder.newClient()
    val webTarget = client.target("http://localhost:8088/ws/v1/cluster")
    println(webTarget.request(MediaType.APPLICATION_JSON).get(classOf[String]))
    val entity = Entity.entity(Person("Bharath", 12), MediaType.APPLICATION_JSON)
    webTarget.request("http://localhost:8088/ws/v1/cluster").post(entity)
    println(webTarget.request(MediaType.APPLICATION_JSON).get(classOf[String]))
  }
}

case class Person(name: String, age: Int)
