package com.example.dao;

import com.example.model.StudentModel;

import java.util.List;

public interface StudentDAO {
    StudentModel selectStudent (String npm);
    List<StudentModel> selectAllStudents();
}
