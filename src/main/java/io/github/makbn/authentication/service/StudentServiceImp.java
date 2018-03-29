package io.github.makbn.authentication.service;

import io.github.makbn.authentication.model.Student;
import io.github.makbn.authentication.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("studentService")
@Transactional
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentByStdNo(String stdNo) {
        List<Student> students=studentRepository.findStudentByStudentNumber(stdNo);

        return students==null || students.size()==0 ? null: students.get(0);
    }

    public void save(Student student){
        this.studentRepository.save(student);
    }
}
