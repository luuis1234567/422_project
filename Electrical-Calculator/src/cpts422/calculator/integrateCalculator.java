package cpts422.calculator;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;


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
		IntegrateCompile();
		
		IntegrateExpressionEvaluate();
		IntegrateNodeEvaluate();
	}
	
	@Test
	void IntegrateExpression() {
		try (MockedConstruction<Expression> mock = mockConstruction(Expression.class)) {
			// Creating a mock instance
			Expression expression = new Expression("1+2");
			
			OperatorNode root = new OperatorNode('+');
			root.SetNodeLeft(new ConstantNode(1));
			root.SetNodeRight(new ConstantNode(2));
			OperatorNode sRoot = spy(root);
			
			when(expression.Compile("1+2")).thenReturn(sRoot);
			
			expression.Compile("1+2");
			Expression constructed = mock.constructed().get(0);
			verify(constructed, atLeast(1)).Compile("1+2");
		}
	}
	
	@Test
	void IntegrateCompile() {
		try (MockedConstruction<OperatorNode> mock = mockConstruction(OperatorNode.class)) {
			Expression expression = new Expression("1+2");
			
	        assertEquals(mock.constructed().size(), 1);
		}
	}
	
	@Test
	void IntegrateExpressionEvaluate()
	{
		Expression expression = new Expression("1+2");
		
		Node node = spy(expression.GetRoot());
		
		when(node.Evaluate()).thenReturn(3.0);
		
		double result = expression.Evaluate();
		
		assertEquals(result, 3.0);
		verify(node, atLeast(1)).Evaluate();
	}
	
	@Test
	void IntegrateNodeEvaluate()
	{		
		Expression expression = new Expression("1+2");
		
		assertEquals(expression.Evaluate(), 3.0);
	}
}
