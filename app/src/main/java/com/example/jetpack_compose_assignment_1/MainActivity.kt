package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.jetpack_compose_assignment_1.model.Course
import com.example.jetpack_compose_assignment_1.ui.CourseListScreen
import com.example.jetpack_compose_assignment_1.ui.theme.YourAppNameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YourAppNameTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val sampleCourses = listOf(
                        Course(
                            "Calculus I",
                            "MATH101",
                            3,
                            "Introduction to differential calculus.",
                            "High school algebra"
                        ),
                        Course(
                            "Intro to CS",
                            "CS101",
                            4,
                            "Basics of programming and problem-solving.",
                            "None"
                        ),
                        Course(
                            "Data Structures",
                            "CS202",
                            3,
                            "Stacks, queues, trees, and graphs.",
                            "CS101"
                        )
                    )
                    CourseListScreen(courseList = sampleCourses)
                }
            }
        }
    }
}
