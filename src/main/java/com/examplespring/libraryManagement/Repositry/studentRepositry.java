package com.examplespring.libraryManagement.Repositry;

import com.examplespring.libraryManagement.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface studentRepositry extends JpaRepository<student,Integer> {
}
