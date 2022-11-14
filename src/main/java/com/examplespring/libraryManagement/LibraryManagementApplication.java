package com.examplespring.libraryManagement;

import com.examplespring.libraryManagement.Repositry.libCardRepositry;
import com.examplespring.libraryManagement.Repositry.studentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	@Autowired
	libCardRepositry libCardRepositry;
	@Autowired
	studentRepositry studentRepositry;

	@Override
	public void run(String... args) throws Exception {

student student =new student("kala",45,987657,"Kashi");
student student1 =new student("niki",21,12345,"hyderbad");
libraycard card =new libraycard(7);
student.setLibraycard(card);

libCardRepositry.save(card);
studentRepositry.save(student);
studentRepositry.save(student1);

	}
}
