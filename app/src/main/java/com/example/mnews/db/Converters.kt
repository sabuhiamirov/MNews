package com.example.mnews.db

import androidx.room.TypeConverter
import com.example.mnews.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String{

        return source.name?.let {  }.toString()
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name,name)
    }
}