package com.todddemone.studentmanager;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class StudentRepository {
    private final Map<String, Student> students = new HashMap<>();

    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    public Set<Student> getAllStudents() {
        return Set.copyOf(students.values());
    }

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public void removeStudent(String studentId) {
        students.remove(studentId);
    }
}
