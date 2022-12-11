// Category Partition technique
// 

// Input number:

// # Sign ( S ):
//  S1 - negative
//  S2 - positive

// # Magnitude ( M ):
//  M1 - max integer
//  M2 - zero
//  M3 - decimal; eg 0.33

// Test cases (combinations) :
// Case1) S1 & M1 : negative infinity
// Case2) S1 & M3 : negative decimal number; eg -0.33
// Case3) S2 & M1 : positive infinity
// Case4) S2 & M2 : zero
// Case5) S2 & M3 : positive decimal number; eg +0.33

package cpts422.calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Expression.class)
class integrateCalculatorBlackBoxV2 {

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
	
	// Main helper to be used in integration testing
	static double DoMain(Expression e)
	{
		double result = e.Evaluate();
		return result;
	}

	// step 1 - Main.main
	@Test
	void IntegrateMain() throws Exception 
	{
		double expected = 3.0;
		
		Expression exp = new Expression("1+2");
		Expression sexp = PowerMockito.spy(exp);
		
		PowerMockito.whenNew(Expression.class).withAnyArguments().thenReturn(sexp);
		
		PowerMockito.when(sexp.Evaluate()).thenReturn(3.0);
		
		double result = DoMain(sexp);
		
		verify(sexp, times(1)).Evaluate();
		assertEquals(expected, result);
		
	}
	
	// step 2 - Expression.Expression
	@Test
	void IntegrateExpression() throws Exception 
	{
		double expected = 3.0;
		
		Expression exp = new Expression("1+2");
		Expression sexp = PowerMockito.spy(exp);
				
		PowerMockito.when(sexp.Evaluate()).thenReturn(3.0);
		PowerMockito.when(sexp.Compile("1+2")).thenReturn(null);
		
		double result = DoMain(sexp); 
		
		assertEquals(expected, result);
		
	}
	
	// step 3 - Expression.Evaluate
	@Test
	void IntegrateExpressionEvaluate() throws Exception 
	{
		double expected = 3.0;
		
		Expression exp = new Expression("1+2");
		Expression sexp = PowerMockito.spy(exp);
		
		Node node = exp.GetRoot();
		Node snode = PowerMockito.spy(node);
					
		PowerMockito.when(sexp.Compile("1+2")).thenReturn(null);
		PowerMockito.when(snode.Evaluate()).thenReturn(3.0);
		
		double result = DoMain(sexp); 
			
		assertEquals(expected, result);
			
	}
	
	// step 4 - Node.Evaluate
	@Test
	void IntegrateNodeEvaluate() throws Exception 
	{
		double expected = 3.0;
		
		Expression exp = new Expression("1+2");
		Expression sexp = PowerMockito.spy(exp);
					
		PowerMockito.when(sexp.Compile("1+2")).thenReturn(null);
		
		double result = DoMain(sexp); 
			
		assertEquals(expected, result);
			
	}
	
	// step 5 - Expression.Compile(String)
	@Test
	void IntegrateCompile1() throws Exception 
	{
		double expected = 3.0;
		
		Expression exp = new Expression("1+2");
		Expression sexp = PowerMockito.spy(exp);
		
		Node node = exp.GetRoot();
		Node snode = PowerMockito.spy(node);
					
		PowerMockito.when(sexp.Compile("1+2")).thenReturn(snode);
		
		double result = DoMain(sexp); 
			
		assertEquals(expected, result);
			
	}
	
	//step 6 - Expression.Compile(String, Char)
	@Test
	void IntegrateCompile2() throws Exception 
	{
		double expected = 3.0;

		OperatorNode root = new OperatorNode('+');
		root.SetNodeLeft(new ConstantNode(1));
		root.SetNodeRight(new ConstantNode(2));
		
		OperatorNode sRoot = PowerMockito.spy(root);
					
		PowerMockito.whenNew(OperatorNode.class).withAnyArguments().thenReturn(sRoot);
		PowerMockito.doNothing().when(sRoot).SetNodeLeft(Matchers.any(Node.class));
		PowerMockito.doNothing().when(sRoot).SetNodeRight(Matchers.any(Node.class));

		Expression exp = new Expression("1+2");
		double result = DoMain(exp); 
			
		assertEquals(expected, result);
			
	}
	
	// step 7 - OperatorNode.OperatorNode
	@Test
	void IntegrateOperatorNode() throws Exception 
	{
		double expected = 3.0;

		OperatorNode root = new OperatorNode('+');
		root.SetNodeLeft(new ConstantNode(1));
		root.SetNodeRight(new ConstantNode(2));
		
		OperatorNode sRoot = PowerMockito.spy(root);
					
		PowerMockito.doNothing().when(sRoot).SetNodeLeft(Matchers.any(Node.class));
		PowerMockito.doNothing().when(sRoot).SetNodeRight(Matchers.any(Node.class));

		Expression exp = new Expression("1+2");
		double result = DoMain(exp); 
			
		assertEquals(expected, result);
			
	}
	
	// step 8 - OperatorNode.SetNodeLeft
	@Test
	void IntegrateSetNodeLeft() throws Exception 
	{
		double expected = 3.0;

		OperatorNode root = new OperatorNode('+');
		root.SetNodeLeft(new ConstantNode(1));
		root.SetNodeRight(new ConstantNode(2));
		
		OperatorNode sRoot = PowerMockito.spy(root);
					
		PowerMockito.doNothing().when(sRoot).SetNodeRight(Matchers.any(Node.class));

		Expression exp = new Expression("1+2");
		double result = DoMain(exp); 
			
		assertEquals(expected, result);
			
	}
	
	// step 9 - OperatorNode.SetNodeRight
	
	// Test cases (combinations) :
	// Case1) S1 & M1 : negative infinity
	// Case2) S1 & M3 : negative decimal number; eg -0.33
	// Case3) S2 & M1 : positive infinity
	// Case4) S2 & M2 : zero
	// Case5) S2 & M3 : positive decimal number; eg +0.33
	@Test
	void IntegrateSetNodeRight() throws Exception 
	{
		double expectedCase1 = 1.0E9;
		double expectedCase2 = -0.4;
		double expectedCase3 = 0;
		double expectedCase4 = -999999999;
		double expectedCase5 = 0.6;
		
		Expression exp = new Expression("500000000+500000000");
		double resultCase1 = DoMain(exp);
		
		exp = new Expression("0.6-1");
		double resultCase2 = DoMain(exp);
		
		exp = new Expression("1-1");
		double resultCase3 = DoMain(exp);
		
		exp = new Expression("0-999999999");
		double resultCase4 = DoMain(exp);
		
		exp = new Expression("1-0.4");
		double resultCase5 = DoMain(exp);
			
		assertEquals(expectedCase1, resultCase1);
		assertEquals(expectedCase2, resultCase2);
		assertEquals(expectedCase3, resultCase3);
		assertEquals(expectedCase4, resultCase4);
		assertEquals(expectedCase5, resultCase5);

	}
}