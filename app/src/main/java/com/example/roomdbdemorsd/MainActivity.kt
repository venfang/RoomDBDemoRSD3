package com.example.roomdbdemorsd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import com.example.roomdbdemorsd.data.ProductDB
import com.example.roomdbdemorsd.data.ProductDao
import com.example.roomdbdemorsd.R
import com.example.roomdbdemorsd.data.Product

class MainActivity : AppCompatActivity() {

    lateinit var dao : ProductDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dao = ProductDB.getInstance(application).productDao

        val btn : Button = findViewById(R.id.btnInsert)

        btn.setOnClickListener(){

            val product = Product(0, "TangKokHou", 2.50 )

            CoroutineScope(IO).launch {
                dao.insertProduct(product)
            }

        }

    }
}