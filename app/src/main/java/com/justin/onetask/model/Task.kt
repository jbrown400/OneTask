package com.justin.onetask.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "description") var description: String = "",
    @ColumnInfo(name = "notes") var notes: String = "",
    @ColumnInfo(name = "priority") @TypeConverter() var priority: Priority
)