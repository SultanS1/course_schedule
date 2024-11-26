package com.alatoo.coursescheduler.utils

import com.alatoo.coursescheduler.entities.Subject
import com.alatoo.coursescheduler.entities.User

object SchedulesProvider {

    var user = "COM-21"

    fun mondaySchedule(user: String): List<Subject> {
        return when(user) {
            "COM-21" -> listOf(
                Subject(
                    "Machine learning",
                    "Taukheed Khan",
                    "Lab5",
                    "10:45",
                    "12:55"
                ), Subject(
                    "Software Architecture & Design patterns / Introduction to Data Mining",
                    "Dr. Arslan Khan / Ms. Mekia Shigute Gaso",
                    "Lab5/Lab3",
                    "13:45",
                    "15:10"
                ),Subject(
                    "Information Security ",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "15:15",
                    "16:40"
                )
            )
            "COM-22" -> listOf(
                Subject(
                    "Computer Networks & Telecommunication",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Algorithms and Analyzes",
                    "Ms. Mekia Shigute Gaso",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            "COM-23" -> listOf(
                Subject(
                    "Artificial Intelligence",
                    "Mr. Dim Shayakhmetov",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                ),
                Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )

            else -> { listOf() }
        }
    }

    fun tuesdaySchedule(user: String): List<Subject> {
        return when(user) {
            "COM-21" -> listOf(
                Subject(
                    "Software Architecture & Design patterns / Introduction to Data Mining",
                    "Dr. Arslan Khan / Ms. Mekia Shigute Gaso",
                    "Lab5/Lab3",
                    "13:45",
                    "15:10"
                ),Subject(
                    "Information Security ",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "15:15",
                    "16:40"
                )
            )
            "COM-22" -> listOf(
                Subject(
                    "Computer Networks & Telecommunication",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Algorithms and Analyzes",
                    "Ms. Mekia Shigute Gaso",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            "COM-23" -> listOf(
                Subject(
                    "Artificial Intelligence",
                    "Mr. Dim Shayakhmetov",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                ),
                Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            else -> { listOf() }
        }
    }

    fun wednesdaySchedule(user: String): List<Subject> {
        return when(user) {
            "COM-21" -> listOf(
                Subject(
                    "Software Architecture & Design patterns / Introduction to Data Mining",
                    "Dr. Arslan Khan / Ms. Mekia Shigute Gaso",
                    "Lab5/Lab3",
                    "13:45",
                    "15:10"
                ),Subject(
                    "Information Security ",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "15:15",
                    "16:40"
                )
            )
            "COM-22" -> listOf(
                Subject(
                    "Computer Networks & Telecommunication",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Algorithms and Analyzes",
                    "Ms. Mekia Shigute Gaso",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            "COM-23" -> listOf(
                Subject(
                    "Artificial Intelligence",
                    "Mr. Dim Shayakhmetov",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                ),
                Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            else -> { listOf() }
        }
    }

    fun thursdaySchedule(user: String): List<Subject> {
        return when(user) {
            "COM-21" -> listOf(
                Subject(
                    "Software Architecture & Design patterns / Introduction to Data Mining",
                    "Dr. Arslan Khan / Ms. Mekia Shigute Gaso",
                    "Lab5/Lab3",
                    "13:45",
                    "15:10"
                ),Subject(
                    "Information Security ",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "15:15",
                    "16:40"
                )
            )
            "COM-22" -> listOf(
                Subject(
                    "Computer Networks & Telecommunication",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Algorithms and Analyzes",
                    "Ms. Mekia Shigute Gaso",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            "COM-23" -> listOf(
                Subject(
                    "Artificial Intelligence",
                    "Mr. Dim Shayakhmetov",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                ),
                Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            else -> { listOf() }
        }
    }

    fun fridaySchedule(user: String): List<Subject> {
        return when(user) {
            "COM-21" -> listOf(
                Subject(
                    "Software Architecture & Design patterns / Introduction to Data Mining",
                    "Dr. Arslan Khan / Ms. Mekia Shigute Gaso",
                    "Lab5/Lab3",
                    "13:45",
                    "15:10"
                ),Subject(
                    "Information Security ",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "15:15",
                    "16:40"
                )
            )
            "COM-22" -> listOf(
                Subject(
                    "Computer Networks & Telecommunication",
                    "Mr. Imtiyaz Gulbarga",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Algorithms and Analyzes",
                    "Ms. Mekia Shigute Gaso",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            "COM-23" -> listOf(
                Subject(
                    "Artificial Intelligence",
                    "Mr. Dim Shayakhmetov",
                    "Big Lab",
                    "9:00",
                    "11:15"
                ), Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                ),
                Subject(
                    "Marketing",
                    "Mr. Rustam",
                    "Big Lab",
                    "11:30",
                    "12:55"
                )
            )
            else -> { listOf() }
        }
    }
}