package cpts422.calculator;


enum Function {
	SQRT, LOG, LN, SIN, COS, TAN, FACTORIAL
}

public class FunctionNode extends Node
{
	private Node node;
	private Function function;
	
	public FunctionNode(Function _function)
	{
		function = _function;
	}
	
	public double Evaluate()
	{
		if (this != null)
		{
			switch(this.function)
			{
				case SQRT:
					break;
				case LOG:
					break;
				case LN:
					break;
				case SIN:
					break;
				case COS:
					break;
				case TAN:
					break;
				case FACTORIAL:
					break;
				default:
					System.out.format("\nFunction not supported.\n");
			}
		}
		
		return node.Evaluate();
	}
	
	public Node GetNode()
	{
		return this.node;
	}
	
	public Function GetFunction()
	{
		return this.function;
	}
	
	public void SetNode(Node _node)
	{
		this.node = _node;
	}
	
	public void SetFunctioon(Function _function)
	{
		this.function = _function;
	}
}
