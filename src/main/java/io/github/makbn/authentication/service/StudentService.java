package io.github.makbn.authentication.service;

import io.github.makbn.authentication.model.Student;

public interface StudentService {

    Student getStudentByStdNo(String StdNo);

    void save(Student student);
}
