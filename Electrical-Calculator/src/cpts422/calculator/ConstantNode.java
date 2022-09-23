package cpts422.calculator;

public class ConstantNode extends Node
{
	// Properties
	private double value;
	
	// Override from Node
	public double Evaluate()
	{
		return this.value;
	}
	
	public double GetValue()
	{
		return this.value;
	}
	
	public void SetValue(double _value)
	{
		this.value = _value;
	}
}
