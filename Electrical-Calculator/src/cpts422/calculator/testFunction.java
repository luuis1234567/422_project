package cpts422.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testFunction{

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
	void testGetSetOperator() {
		OperatorNode opnNode = new OperatorNode('+');
		assertEquals('+', opnNode.GetOperator());
		opnNode.SetOperator('*');
		assertEquals('*', opnNode.GetOperator());
	}
	@Test
	void testGetSetValue() {
		ConstantNode cNode = new ConstantNode(8);
		assertEquals(8.0, cNode.GetValue());
		cNode.SetValue(90);
		assertEquals(90.0, cNode.GetValue());
	}
	@Test
	void testGetSetLeftNode() {
		OperatorNode root = new OperatorNode('+');
		ConstantNode cNode1 = new ConstantNode(1);
		root.SetNodeLeft(cNode1);
		assertEquals(cNode1.hashCode(), root.GetNodeLeft().hashCode());
	}
	@Test
	void testGetSetRightNode() {
		OperatorNode root = new OperatorNode('+');
		ConstantNode cNode1 = new ConstantNode(89);
		root.SetNodeRight(cNode1);
		assertEquals(cNode1.hashCode(), root.GetNodeRight().hashCode());
	}
}
