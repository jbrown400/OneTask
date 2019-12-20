package com.justin.onetask.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.util.*

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "description") var description: String = "",
    @ColumnInfo(name = "notes") var notes: String = "",
    @ColumnInfo(name = "priority") @TypeConverters(Converters::class) var priority: Priority,
    @ColumnInfo(name = "due_date") @TypeConverters(Converters::class) var dueDate: Calendar,
    @ColumnInfo(name = "complete") var complete: Boolean
)