package Triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class TriangleTest {
	
	@Test
	void testIsIsosceles() {
		Triangle triangle  = new Triangle(4, 5, 5);
		assertTrue(triangle.isIsosceles());
	}
	
	@Test 
	void testIsEquilateral() {
		Triangle triangle = new Triangle(6);
		assertTrue(triangle.isEquilateral());
	}
	
	@Test 
	void testIsScalene() {
		Triangle triangle = new Triangle(1,2,3);
		assertTrue(triangle.isScalene());
	}
	
	@Test
	void testSetSides() {
		Triangle triangle = new Triangle();
		triangle.setSides(5);
		assertTrue(triangle.isEquilateral());
	}
	
	@Test
	void testSetSidesWithNegativeValues() {
		Triangle triangle = new Triangle();
		triangle.setSides(-3, 4, 4);
		assertTrue(triangle.isIsosceles());
	}
	
	@RepeatedTest(1)
	void testGetPerimeter() {
		Triangle triangle = new Triangle(4, 5, 6);
		assertEquals(15, triangle.getPerimeter());
	}
	
	@Test
	void testGetAverageLength() {
		Triangle triangle = new Triangle(4, 5, 6);
		assertEquals(5, triangle.getAverageLength());
		
	}
	
	@Test
	void testGetPerimeterWithNegativeValues() {
		Triangle triangle = new Triangle(-2, 3, 4);
		assertEquals(9, triangle.getPerimeter());
	}
	
	@ParameterizedTest
	@CsvSource({"3, 4, 5, 12"})

	void testGetPerimeter(int a, int b, int c, int expectedPerimeter) {
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(expectedPerimeter, triangle.getPerimeter());
    }
	
	@ParameterizedTest
	@CsvSource({ "5, 5, 9"})
	void testTriangleConstructorWithThreeParametersForIsosceles(int sideA, int sideB, int SideC) {
		Triangle triangle = new Triangle(sideA, sideB, SideC);
		assertTrue(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 5, -5 })
	void testTriangleConstructorWithOneParameter(int sideLength) {
		Triangle triangle = new Triangle(sideLength);
		assertTrue(triangle.isEquilateral());
	}

	@Test
	void testDefaultTriangleConstructor() {
		Triangle triangle = new Triangle();
		assertTrue(triangle.isEquilateral());
	}
	
	
	
	
	

	
}
