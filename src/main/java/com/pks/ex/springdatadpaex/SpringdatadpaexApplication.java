package com.pks.ex.springdatadpaex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdatadpaexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdatadpaexApplication.class, args);
		StudentRepository repository = context.getBean(StudentRepository.class);
		Student student = new Student(101, "Pankaj", "pankaj@infosys", "CUSAT", 29, 1200.0);
		Student student1 = new Student(101, "Pankaj", "pankaj@infosys", "CUSAT", 29, 1200.0);
		Student student2 = new Student(101, "Pankaj", "pankaj@infosys", "CUSAT", 29, 1200.0);
		Student student3 = new Student(101, "Pankaj", "pankaj@infosys", "CUSAT", 29, 1200.0);
		// repository.save(student);
		List<Student> students = List.of(student, student1, student2, student3);
		repository.saveAll(students);
		repository.findAll().forEach(System.out::println);

	}

}
