package com.marinato.quizmelhorde10.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.marinato.quizmelhorde10.R

class RadioButtonAdapter(
    private val context: Context,
    private val dataList: List<String>,
    private var selectedItem: Int,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<RadioButtonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.layout_radio_group_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemText = dataList[position]
        holder.textView.text = itemText
        holder.radioButton.isChecked = position == selectedItem

        holder.itemView.setOnClickListener {
            if (selectedItem != position) {
                selectedItem = position
                notifyDataSetChanged()
                onClick(dataList[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun getSelectedItem(): Int {
        return selectedItem
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.text_view)
        val radioButton: RadioButton = itemView.findViewById(R.id.radio_button)
        init {
            radioButton.setOnCheckedChangeListener { buttonView, isChecked ->  }
        }
    }
}
