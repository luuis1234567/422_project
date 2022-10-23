package cpts422.calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



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
	
	double DoMain()
	{
		Expression expression = new Expression("1+2");
		double result = expression.Evaluate();
		return result;
	}
	
	@Test
	void IntegrateCalculator() {
		IntegrateExpression();
		IntegrateCompileA();
		IntegrateCompileB();
		IntegrateOperatorNode();
		
		IntegrateExpressionEvaluate();
		IntegrateNodeEvaluate();
	}
	
	@Test
	void IntegrateExpression() {
		Expression expression = new Expression("1+2");
		Expression sExpression = spy(expression);
		
		OperatorNode root = new OperatorNode('+');
		root.SetNodeLeft(new ConstantNode(1));
		root.SetNodeRight(new ConstantNode(2));
		OperatorNode sRoot = spy (root);
		
		when(sExpression.Compile("1+2")).thenReturn(sRoot);
		
		double result = DoMain();
		assertEquals(3, result);
	}
	
	@Test
	void IntegrateCompileA() {
		Expression expression = new Expression("1+2");
		Expression sExpression = spy(expression);
		
		OperatorNode root = new OperatorNode('+');
		root.SetNodeLeft(new ConstantNode(1));
		root.SetNodeRight(new ConstantNode(2));
		OperatorNode sRoot = spy (root);
		
		when(sExpression.Compile("1+2", '+')).thenReturn(sRoot);
		
		double result = DoMain();
		assertEquals(3, result);
	}
	
	@Test
	void IntegrateCompileB() {
		double result = DoMain();
		assertEquals(3, result);
	}
	
	@Test
	void IntegrateOperatorNode() {
		
	}
	
	@Test
	void IntegrateOperatorNodeSetLeft() {
		
	}
	
	@Test
	void IntegrateOperatorNodeSetRight() {
		
	}
	
	@Test
	void IntegrateExpressionEvaluate()
	{
		OperatorNode root = new OperatorNode('+');
		root.SetNodeLeft(new ConstantNode(1));
		root.SetNodeRight(new ConstantNode(2));
		
		Node left = root.GetNodeLeft();
		Node right = root.GetNodeRight();
		Node sLeft = spy(left);
		Node sRight = spy(right);
		
		when(sLeft.Evaluate()).thenReturn(1.0);
		when(sRight.Evaluate()).thenReturn(2.0);
		
		double result = DoMain();
		assertEquals(3, result);
	}
	
	@Test
	void IntegrateNodeEvaluate()
	{		
		double result = DoMain();
		assertEquals(3, result);
	}
}
