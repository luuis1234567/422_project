package cpts422.calculator;

public class OperatorNode extends Node
{
	private Node nodeLeft;
	private Node nodeRight;
	private char operator;
	
	public OperatorNode(char c)
	{
		operator = c;
	}
	
	// Override from Node
	public double Evaluate()
	{
		if (this != null)
		{
			switch (this.operator)
			{
				case '+': 
					return this.nodeLeft.Evaluate() + this.nodeRight.Evaluate();
				case '-': 
					return this.nodeLeft.Evaluate() + this.nodeRight.Evaluate();
				case '*': 
					return this.nodeLeft.Evaluate() + this.nodeRight.Evaluate();
				case '/': 
					return this.nodeLeft.Evaluate() + this.nodeRight.Evaluate();
				case '^':
					return this.nodeLeft.Evaluate() + this.nodeRight.Evaluate();
				default:
					System.out.format("\nOperator " + this.operator + " not supported.\n");
			}
		}
		
		return 0.0;
	}
	
	public Node GetNodeLeft()
	{
		return this.nodeLeft;
	}
	
	public Node GetNodeRight()
	{
		return this.nodeRight;
	}
	
	public char GetOperator()
	{
		return this.operator;
	}
	
	public void SetNodeLeft(Node _node)
	{
		this.nodeLeft = _node;
	}
	
	public void SetNodeRight(Node _node)
	{
		this.nodeRight = _node;
	}
	
	public void SetOperator(char _operator)
	{
		this.operator = _operator;
	}
}
