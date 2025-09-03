package com.notestaking.data

import android.content.Context
import androidx.room.Room

object DatabaseProvider {

    fun getDatabase(context: Context) : NoteDatabase{
        return Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            "notes_db"
        ).build()

    }
}