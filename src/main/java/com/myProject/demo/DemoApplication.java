package com.myProject.demo;

import com.myProject.demo.com.myProject.demo.model.Person;
import com.myProject.demo.com.myProject.demo.model.PersonFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		PersonFactory factory = new PersonFactory();
		Person p = factory.getPerson("John", 33);

		File myObj = new File("C:\\Users\\ionut-mihai.suciu\\testFile.txt");

		try {
			FileWriter myWriter = new FileWriter(myObj);
			myWriter.write(p.getName());
			myWriter.write(p.getAge());
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
