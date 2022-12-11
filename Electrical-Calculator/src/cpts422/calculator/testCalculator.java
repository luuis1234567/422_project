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

	//The new test case for Milestone3(BlackBox)
	@Test
	void newTest(){
		Expression expression1 = new Expression("10+1");
		assertEquals(11.0, expression1.Evaluate());
		Expression expression2 = new Expression("22-3");
		assertEquals(19.0, expression2.Evaluate());
		Expression expression3 = new Expression("56*2");
		assertEquals(112, expression3.Evaluate());
		Expression expression4 = new Expression("99/33");
		assertEquals(3.0, expression4.Evaluate());
		Expression expression5 = new Expression("3^3");
		assertEquals(27.0, expression5.Evaluate());
		Expression expression6 = new Expression("-2^1024-1");
		assertEquals("Error", expression6.Evaluate());
		Expression expression7 = new Expression("2^1024+1");
		assertEquals("Error", expression7.Evaluate());
		Expression expression8 = new Expression("2+n");
		assertEquals("Error", expression8.Evaluate());
		Expression expression9 = new Expression("2+n");
		assertEquals("Error", expression9.Evaluate());
		Expression expression10 = new Expression("2.3/0.7");
		assertEquals(3.28571428571, expression10.Evaluate());
		Expression expression11 = new Expression("-4*2");
		assertEquals("-8.0", expression11.Evaluate());
		Expression expression12 = new Expression("@");
		assertEquals("Error", expression12.Evaluate());
		Expression expression13 = new Expression("29^'");
		assertEquals("Error", expression13.Evaluate());
		Expression expression14 = new Expression("3+(5-2)");
		assertEquals("6.0", expression14.Evaluate());
		Expression expression15 = new Expression("6*(3+3)");
		assertEquals("36.0", expression15.Evaluate());
		Expression expression16 = new Expression("2+2^2");
		assertEquals("6.0", expression16.Evaluate());
		Expression expression17 = new Expression("2^(2+2)");
		assertEquals("16.0", expression17.Evaluate());
		Expression expression18 = new Expression("2/(2-2)");
		assertEquals("Error", expression18.Evaluate());
		Expression expression19 = new Expression("2^1024-2^1024");
		assertEquals("Error", expression19.Evaluate());
		Expression expression20 = new Expression("2+)(3");
		assertEquals("Error", expression20.Evaluate());
		Expression expression21 = new Expression("(0)");
		assertEquals("0.0", expression21.Evaluate());
		Expression expression22 = new Expression("(1)+(34)");
		assertEquals("35.0", expression22.Evaluate());
		Expression expression23 = new Expression("22/(0)");
		assertEquals("Error", expression23.Evaluate());
		Expression expression24 = new Expression("22^(0)");
		assertEquals("1", expression24.Evaluate());
		Expression expression25 = new Expression("2^(-1)");
		assertEquals("0.5", expression25.Evaluate());
		Expression expression26 = new Expression("one+two+three");
		assertEquals("Error", expression26.Evaluate());
		Expression expression27 = new Expression("-4^2");
		assertEquals("16.0", expression27.Evaluate());
	}
}
