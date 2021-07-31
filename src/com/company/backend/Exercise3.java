package com.company.backend;

import com.company.entity.Student;

public class Exercise3 {
    public void question2(){
        // là nơi giải quyết toàn bộ logic của bài tập
        Student student = new Student(123, "Nguyễn Văn Vở");
        // In ra kiểu đối tượng Student
        print(student);

        // In ra kiểu int
        print(4);

        // In ra kiểu float
        print(4f);
    }

    public <T> void print(T a){
        System.out.println(a.toString());
    }
}
