package com.alatoo.coursescheduler.viewModels

import android.telecom.Call
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alatoo.coursescheduler.entities.ScheduleItem
import com.alatoo.coursescheduler.repository.ScheduleRepository
import kotlinx.coroutines.launch

class ScheduleViewModel: ViewModel() {
    val repository = ScheduleRepository()
    val scheduleResponse: MutableLiveData<ScheduleItem> = MutableLiveData()

    fun getSchedule(){
        viewModelScope.launch {
            try {
                val response = repository.getSchedule()
                println(response.body()?.values?.size)
                scheduleResponse.postValue(response.body())
            } catch (e: Throwable){
                println("Error is: ${e.message}")
            }
        }
    }



}