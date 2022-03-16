package com.techmania.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.techmania.gridview.SaiAdapter as SaiAdapter1

class MainActivity : AppCompatActivity() {


    lateinit var gridView : GridView
   var  namelist = ArrayList<String>()
    var imageList =ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        fillArrays()

          var adapter = SaiAdapter1(this,namelist, imageList)
         gridView.adapter= adapter




    }


    fun fillArrays()
    {
        namelist.add("sai1")
        namelist.add("sai2")
        namelist.add("sai3")
        namelist.add("sai4")
        namelist.add("sai5")
        namelist.add("sai6")
        namelist.add("sai7")
        namelist.add("sai8")
        namelist.add("sai9")

        imageList.add(R.drawable.sai)
        imageList.add(R.drawable.sai10)

        imageList.add(R.drawable.sai11)

        imageList.add(R.drawable.sai12)

        imageList.add(R.drawable.sai14)
        imageList.add(R.drawable.sai15)

        imageList.add(R.drawable.sai16)

        imageList.add(R.drawable.sai17)

        imageList.add(R.drawable.sai18)




    }


}