package com.notestaking.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey val id : Int = 0,
    val title : String,
    val content : String,
    val tag : String,
    val timestamp: Long = System.currentTimeMillis()
)