package com.kodilla;

import com.kodilla.spring.library.LibraryConfig;
import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("circle");

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is a circle.", name);
	}

	@Test
	void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("triangle");

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is a triangle.", name);
	}

	@Test
	void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("createSquare");

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is a square.", name);
	}

	@Test
	void testShapeLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("chosenShape");

		//When
		String name = shape.getShapeName();

		//Then
		System.out.println("Chosen shape says: " + name);
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testContext() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");

		//When & Then
		System.out.println("===== Beans list: ==== >>");
		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		System.out.println("<< ===== Beans list ====");
	}

}
