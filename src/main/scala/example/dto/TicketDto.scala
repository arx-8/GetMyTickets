package example.dto

import java.time.LocalDate

import example.SizeEnum.Size


class TicketDto {
  // キー
  val issueKey = ""
  // 件名
  val title = ""
  // 開始日
  val startDate: Option[LocalDate] = None
  // 期限日
  val limitDate: Option[LocalDate] = None
  // 予定時間
  val estimatedHours: Option[Double] = None
  // 実績時間
  val actualHours: Option[Double] = None
  // 更新日
  val updatedDate: Option[LocalDate] = None
  // 規模
  var size: Option[Size] = None
}

