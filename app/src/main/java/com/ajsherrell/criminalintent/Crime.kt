package com.ajsherrell.criminalintent

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.UUID
import java.util.Date

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: DateFormat = DateFormat.getDateTimeInstance(),
    var isSolved: Boolean = false
)