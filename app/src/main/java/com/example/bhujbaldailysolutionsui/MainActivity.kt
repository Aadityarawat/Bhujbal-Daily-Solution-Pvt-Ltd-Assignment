package com.example.bhujbaldailysolutionsui

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val strike = findViewById<TextView>(R.id.gststrike)
        strike.apply {
            paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

        }

        val item = listOf<String>("Dairy","News Paper","Grocery (Kirana)","Water Supplier","Tiffin / Meal Service","Fruits & Vegetables")
        val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete_txt)
        val adapter = ArrayAdapter(this,R.layout.list_item,item)
        
        autoComplete.setAdapter(adapter)
        autoComplete.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this,"Item $itemSelected",Toast.LENGTH_LONG).show()

        }

        val item1 = listOf<String>("Daily","Monthly","Yearly")
        val autoComplete1 : AutoCompleteTextView = findViewById(R.id.auto_complete_txt1)
        val adapter1 = ArrayAdapter(this,R.layout.list_item,item1)

        autoComplete1.setAdapter(adapter1)
        autoComplete1.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this,"Item $itemSelected",Toast.LENGTH_LONG).show()

        }
    }
}