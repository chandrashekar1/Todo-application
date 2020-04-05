package com.intfitydevloper.todoapp


import android.content.IntentSender
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.RowId
import java.util.*

@Entity
data class TodoModel(
    var title:String,
    var description:String,
    var category:String,
    var date:Long,
    var time:Long,
    var isFinished: Int = -1,
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0


)
