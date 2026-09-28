package com.example.studentinfo_mssv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.studentinfo_mssv.model.Student

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val student = Student(
            studentId = "22123456",
            fullName = "Nguyen Van A",
            className = "22IT1",
            age = 20,
            score = 8.5
        )
        setContent {
            StudentInfoScreen(student)
        }
    }
}
@Composable
fun StudentInfoScreen(student: Student) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "THÔNG TIN SINH VIÊN")
        Text(text = "Mã sinh viên: ${student.studentId}")
        Text(text = "Họ tên: ${student.fullName}")
        Text(text = "Lớp: ${student.className}")
        Text(text = "Tuổi: ${student.age}")
        Text(text = "Điểm: ${student.score}")
    }
}