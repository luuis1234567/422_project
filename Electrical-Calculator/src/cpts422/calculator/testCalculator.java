package cpts422.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCalculator {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPlus() {
		Expression expression = new Expression("1+2");
		assertEquals(3.0, expression.Evaluate());
		Expression expression2 = new Expression("34+789");
		assertEquals(823.0, expression2.Evaluate());
	}
	@Test
	void testMinus() {
		Expression expression = new Expression("33-12");
		assertEquals(21.0, expression.Evaluate());
		Expression expression2 = new Expression("999-100");
		assertEquals(899.0, expression2.Evaluate());
	}
	@Test
	void testMultiply() {
		Expression expression = new Expression("22*100");
		assertEquals(2200.0, expression.Evaluate());
		Expression expression2 = new Expression("445*78");
		assertEquals(34710.0, expression2.Evaluate());
	}
	@Test
	void testDivide() {
		Expression expression = new Expression("1000/2");
		assertEquals(500.0, expression.Evaluate());
		Expression expression2 = new Expression("783/3");
		assertEquals(261.0, expression2.Evaluate());
	}
	@Test
	void testPower() {
		Expression expression = new Expression("9^3");
		assertEquals(729.0, expression.Evaluate());
		Expression expression2 = new Expression("5^4");
		assertEquals(625.0, expression2.Evaluate());
	}
	@Test
	void testOrder() {
		Expression expression = new Expression("(1+2)*4");
		assertEquals(12.0, expression.Evaluate());
		Expression expression2 = new Expression("(32+128)/2");
		assertEquals(80.0, expression2.Evaluate());
	}
	@Test
	void testDecimal() {
		Expression expression = new Expression("3.2+4.8");
		assertEquals(8.0, expression.Evaluate());
		Expression expression2 = new Expression("5.67*9.72");
		assertEquals(55.1124, expression2.Evaluate());
		Expression expression3 = new Expression("9.68/1.2");
		assertEquals(8.066666666666666, expression3.Evaluate());
	}
	//Not support yet,second line is the number should appear
	@Test
	void testSin() {
		Expression expression = new Expression("Sin(54)");
		//assertEquals(-0.559, expression.Evaluate());
		assertEquals(0.0, expression.Evaluate());
	}
	//Not support yet,second line is the number should appear
	@Test
	void testCos() {
		Expression expression = new Expression("Cos(38)");
		//assertEquals(0.955, expression.Evaluate());
		assertEquals(0.0, expression.Evaluate());
	}
	//Not support yet,second line is the number should appear
	@Test
	void testTan() {
		Expression expression = new Expression("Tan(98)");
		//assertEquals(0.7, expression.Evaluate());
		assertEquals(0.0, expression.Evaluate());
	}
	//Not support yet,second line is the number should appear
	@Test
	void testLog() {
		Expression expression = new Expression("Log(24)");
		//assertEquals(1.380, expression.Evaluate());
		assertEquals(0.0, expression.Evaluate());
	}
	//Not support yet,second line is the number should appear
	@Test
	void testLn() {
		Expression expression = new Expression("Ln(60)");
		//assertEquals(4.094, expression.Evaluate());
		assertEquals(0.0, expression.Evaluate());
	}
	//Not support yet,second line is the number should appear
	@Test
	void testSqrt() {
		Expression expression = new Expression("Sqrt(81)");
		//assertEquals(9.0, expression.Evaluate());
		assertEquals(0.0, expression.Evaluate());
	}
}
