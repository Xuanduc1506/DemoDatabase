package com.example.demodatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT new com.example.demodatabase.StudentRespond(st.id,st.name,st.age,sc.name,c.name)  FROM Student st INNER JOIN School sc on st.schoolid = sc.id INNER JOIN className c on st.classid = c.id")
    public List<StudentRespond> getList();



}
