package com.example.studentinfo_2415053122123.extension

import com.example.studentinfo_2415053122123.model.Student

fun Student.getStudentInfo(): String {
    return """
        Mã sinh viên: $studentId
        Họ tên: $fullName
        Lớp: $className
        Tuổi: $age
        Điểm: $score
    """.trimIndent()
}