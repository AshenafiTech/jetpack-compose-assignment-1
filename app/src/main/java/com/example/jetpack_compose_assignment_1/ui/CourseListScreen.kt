package com.example.jetpack_compose_assignment_1.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.jetpack_compose_assignment_1.model.Course

@Composable
fun CourseListScreen(courseList: List<Course>) {
    LazyColumn {
        items(courseList) { course ->
            CourseCard(course = course)
        }
    }
}
