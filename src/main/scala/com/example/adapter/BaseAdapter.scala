package com.example.adapter

import com.example.dto.TicketDto

import scala.collection.mutable.ArrayBuffer

abstract class BaseAdapter {
  protected val tickets = ArrayBuffer.empty[TicketDto]
}
