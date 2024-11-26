package com.alatoo.coursescheduler.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alatoo.coursescheduler.R
import com.alatoo.coursescheduler.databinding.ScheduleHolderItemBinding
import com.alatoo.coursescheduler.entities.Subject

class ScheduleRvAdapter: RecyclerView.Adapter<ScheduleRvAdapter.ViewHolder>() {

    private var items: List<Subject> = emptyList()

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val binding = ScheduleHolderItemBinding.bind(itemView)
        fun bind(item: Subject){
            binding.subjectNameTxt.text = item.name
            binding.timeTxt.text = item.startTime + "-" +item.endTime
            binding.roomTextView.text = item.classroom
            binding.teacherTextView.text = item.teacherName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.schedule_holder_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setItem(newItems: List<Subject>){
        items = newItems
        notifyDataSetChanged()
    }


}