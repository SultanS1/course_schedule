package com.alatoo.coursescheduler.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alatoo.coursescheduler.repository.ScheduleRepository
import kotlinx.coroutines.launch

class ScheduleViewModel: ViewModel() {
    val repository = ScheduleRepository()

    fun getSchedule(){
    }
}
