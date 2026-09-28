package com.example.studentinfo_2415053122123

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentinfo_2415053122123.model.Student
import com.example.studentinfo_2415053122123.databinding.ActivityMainBinding
import com.example.studentinfo_2415053122123.extension.getStudentInfo

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = Student(
            studentId = "2415053122123",
            fullName = "Bùi Tá Lanh",
            className = "24T1",
            age = 20,
            score = 8.5
        )

        binding.tvStudentId.text = "Mã sinh viên: ${student.studentId}"
        binding.tvFullName.text = "Họ tên: ${student.fullName}"
        binding.tvClassName.text = "Lớp: ${student.className}"
        binding.tvAge.text = "Tuổi: ${student.age}"
        binding.tvScore.text = "Điểm: ${student.score}"
    }
}