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
class integrateCalculator {

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
	@Test
	void IntegrateSetNodeRight() throws Exception 
	{
		double expected = 3.0;
		
		Expression exp = new Expression("1+2");
		double result = DoMain(exp);
			
		assertEquals(expected, result);
	}
}
