package example.adapter

import example.dto.TicketDto

import scala.collection.mutable.ArrayBuffer

abstract class BaseAdapter {
  protected val tickets = ArrayBuffer.empty[TicketDto]
}
