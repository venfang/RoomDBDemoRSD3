package com.example.roomdbdemorsd.data


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Product(

    @PrimaryKey (autoGenerate = true)
    var id:Int,

    @ColumnInfo (name = "Description")
    var name:String,

    @ColumnInfo
    var price:Double
)

