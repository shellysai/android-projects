package com.techmania.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class SaiAdapter(
    var context: Context,
    var namelist: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {


    override fun getCount(): Int {
        return namelist.size

    }

    override fun getItem(p0: Int): Any  ? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int,convertView: View?, parent : ViewGroup?): View {

        val view : View =  LayoutInflater.from(parent!!.context).inflate(R.layout.custom_layout,parent,false)

      var sainame:   TextView =view.findViewById(R.id.textView)
        var saiimage : ImageView =view.findViewById(R.id.imageView)
        sainame.text=namelist[position]
        saiimage.setImageResource(imageList.get(position))
        return view

            }
}