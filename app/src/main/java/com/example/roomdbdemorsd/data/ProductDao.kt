package com.example.roomdbdemorsd.data

import androidx.room.Dao
import androidx.room.Insert
import com.example.roomdbdemorsd.data.Product

@Dao
interface ProductDao {

    @Insert
    fun insertProduct (product : Product)


}