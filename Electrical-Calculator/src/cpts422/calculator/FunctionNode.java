package cpts422.calculator;

enum Function {
	SQRT, LOG, LN, SIN, COS, TAN
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
					return Math.sqrt(this.node.Evaluate());
				case LOG:
					return Math.log10(this.node.Evaluate());
				case LN:
					return Math.log(this.node.Evaluate());
				case SIN:
					return Math.sin(this.node.Evaluate());
				case COS:
					return Math.cos(this.node.Evaluate());
				case TAN:
					return Math.tan(this.node.Evaluate());
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
