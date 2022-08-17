package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		System.out.print("Hello Intellij IDEA 2022");
        System.out.println("Prueba para segundo commit de rama master");

		Task task1 = new Task("Aprender Java", false,LocalDate.of(2022, 12, 31));
		System.out.println("descripcion de la tarea:");
		System.out.println(task1.getDescription());
		System.out.println("fecha de la tarea:");
		System.out.println(task1.getDueDate());
		System.out.println("esta lista?");
		System.out.println(task1.getDone());
		Task task2 = new Task("Aprender HTML", false,LocalDate.of(2022, 12, 31));

		TaskList propositos = new TaskList("Propósitos fin de año");
		propositos.addTask(task1);
		propositos.addTask(task2);
		System.out.println(propositos.getTaskList().size());

	}


}
