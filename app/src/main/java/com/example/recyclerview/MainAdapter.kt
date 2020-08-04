package com.example.recyclerview

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.activity_main_adapter.view.*


data class NamesRecyclerViewAdapter(
     val name:String,
     val age:Int,
     val hobby:String
 ): Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder{
        var rowView =
            LayoutInflater.from(parent.context).inflate(R.layout.row_name_item, parent, false)
        return NamesViewHolder(rowView)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvName.text = this.nameList[position]
     }

    class NamesViewHolder ( val rowView: View): ViewHolder(rowView) {

        }
    }

}



