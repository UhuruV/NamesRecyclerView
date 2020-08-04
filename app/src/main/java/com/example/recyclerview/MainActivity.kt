package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.rvName
import kotlinx.android.synthetic.main.row_name_item.*


class MainActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    rvName.layoutManager= LinearLayoutManager(baseContext)
       var nameList=ArrayList<NamesRecyclerViewAdapter>()
       nameList.add(
           NamesRecyclerViewAdapter(
               "Valary",
               22,
           "Volleyball"
           )
       )
       nameList.add(
           NamesRecyclerViewAdapter(
               "Valary",
               22,
               "Volleyball"
           )
       )
       nameList.add(
           NamesRecyclerViewAdapter(
               "Aria",
               22,
               "Volleyball"
           )
       )
       nameList.add(
           NamesRecyclerViewAdapter(
               "Wendy",
               22,
               "Volleyball"
           )
       )
       nameList.add(
           NamesRecyclerViewAdapter(
               "Laura",
               22,
               "Volleyball"
           )
       )

       rvName.adapter=nameList
   }
}