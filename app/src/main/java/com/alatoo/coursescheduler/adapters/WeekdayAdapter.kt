package com.alatoo.coursescheduler.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alatoo.coursescheduler.R
import com.alatoo.coursescheduler.databinding.ItemDayVpBinding
import com.alatoo.coursescheduler.entities.Subject
import com.alatoo.coursescheduler.utils.SchedulesProvider

class WeekdayAdapter : RecyclerView.Adapter<WeekdayAdapter.DayViewHolder>() {

    private val daysOfWeek = mapOf("Monday" to SchedulesProvider.mondaySchedule(SchedulesProvider.user),
        "Tuesday" to SchedulesProvider.tuesdaySchedule(SchedulesProvider.user),
        "Wednesday" to  SchedulesProvider.wednesdaySchedule(SchedulesProvider.user),
        "Thursday" to  SchedulesProvider.thursdaySchedule(SchedulesProvider.user),
        "Friday" to  SchedulesProvider.fridaySchedule(SchedulesProvider.user),
        "Saturday" to SchedulesProvider.tuesdaySchedule(SchedulesProvider.user),
        "Sunday" to  SchedulesProvider.tuesdaySchedule(SchedulesProvider.user))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_day_vp, parent, false)
        return DayViewHolder(view)
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        daysOfWeek.values.toList()
        holder.bind(daysOfWeek.values.toList()[position])
    }

    override fun getItemCount(): Int = daysOfWeek.size

    // ViewHolder class
    inner class DayViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemDayVpBinding.bind(view)
        private val adapter = ScheduleRvAdapter()
        fun bind(day: List<Subject>) {
            adapter.setItem(day)
            binding.scheduleRecyclerView.adapter = adapter
        }
    }
}