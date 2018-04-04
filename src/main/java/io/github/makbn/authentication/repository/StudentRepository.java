package io.github.makbn.authentication.repository;

import io.github.makbn.authentication.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

    @Query(value = "SELECT s from Student s WHERE s.studentNumber = :StdNo")
    List<Student> findStudentByStudentNumber(@Param("StdNo")String studentNumber);

}
