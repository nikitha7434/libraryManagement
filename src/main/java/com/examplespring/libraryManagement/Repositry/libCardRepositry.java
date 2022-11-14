package com.examplespring.libraryManagement.Repositry;

import com.examplespring.libraryManagement.libraycard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface libCardRepositry extends JpaRepository<libraycard,Integer> {
}
