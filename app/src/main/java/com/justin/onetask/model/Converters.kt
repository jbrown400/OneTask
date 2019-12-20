package com.justin.onetask.model

import androidx.room.TypeConverter
import java.util.*

class Converters {

    /*---Priority Converters---*/

    @TypeConverter
    fun priorityToString(priority: Priority?): String {
        return priority?.toString() ?: "NORMAL"
    }

    @TypeConverter
    fun stringToPriority(string: String): Priority {
        when(string) {
            "URGENT" -> return Priority.URGENT
            "HIGH" -> return Priority.HIGH
            "Normal" -> return Priority.NORMAL
            "LOW" -> return Priority.LOW
            "EVENTUALLY" -> return Priority.EVENTUALLY
            else -> return Priority.NORMAL
        }
    }

    /*---Date Converters---*/

    @TypeConverter
    fun dateToLong(calendar: Calendar?): Long {
        return calendar?.time!!.time
    }

    @TypeConverter
    fun longToDate(long: Long): Calendar {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = long
        return calendar
    }
}