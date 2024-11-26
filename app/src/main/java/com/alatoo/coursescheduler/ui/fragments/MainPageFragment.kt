package com.alatoo.coursescheduler.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alatoo.coursescheduler.adapters.WeekdayAdapter
import com.alatoo.coursescheduler.databinding.FragmentMainPageBinding
import com.alatoo.coursescheduler.viewModels.ScheduleViewModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainPageFragment : Fragment() {

    lateinit var binding: FragmentMainPageBinding

    val viewModel = ScheduleViewModel()

    private val adapter = WeekdayAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            viewPager.adapter = adapter
            val daysOfWeek = listOf(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            )
            TabLayoutMediator(binding.tabLayout, binding.viewPager){tab, position ->
                tab.text = daysOfWeek[position]
            }.attach()
        }
    }
}