package cpts422.calculator;

public class Expression 
{
	Node root;
	
	public Expression(String expression)
	{
		root = Compile(expression);
	}
	
	public Node Compile(String s)
	{
		if (s.isEmpty())
		{
			return null;
		}
		
		if ('(' == s.charAt(0))
		{
			int parenthesisCounter = 1;
            for (int characterIndex = 1; characterIndex < s.length(); characterIndex++)
            {
                // if open parenthesis increment a counter
                if ('(' == s.charAt(characterIndex))
                {
                    parenthesisCounter++;
                }
                // if closed parenthesis decrement the counter
                else if (')' == s.charAt(characterIndex))
                {
                    parenthesisCounter--;
                    // if the counter is 0 check where we are
                    if (0 == parenthesisCounter)
                    {
                        if (characterIndex != s.length() - 1)
                        {
                            // if we are not at the end, then get out (there are no extra parentheses)
                            break;
                        }
                        else
                        {
                            // Else get rid of the outer most parentheses and start over
                            return Compile(s.substring(1, s.length() - 1));
                        }
                    }
                }
            }
		}
		
		// define the operators we want to look for in that order
        char[] operators = { '+', '-', '*', '/', '^' };
        for (int i = 0; i < 5; i++)
        {
            Node n = Compile(s, operators[i]);
            if (n != null) return n;
        }

        try 
        {
        	double number = Double.parseDouble(s);
        	// a constant
        	return new ConstantNode(number);
        }
        catch (Exception e)
        {
        	System.out.println("Exception: " + e);
        }

        return new ConstantNode(0);
	}
	
	public Node Compile(String expression, char op)
    {
        // track the parentheses
        int parenthesisCounter = 0;
        // iterate from back to front
        for (int expressionIndex = expression.length() - 1; expressionIndex >= 0; expressionIndex--)
        {
            // if closed parenthesis INcrement the counter
            if (')' == expression.charAt(expressionIndex))
            {
                parenthesisCounter++;
            }
            // if open parenthesis DEcrement the counter
            else if ('(' == expression.charAt(expressionIndex))
            {
                parenthesisCounter--;
            }
            // if the counter is at 0 and we have the operator that we are looking for
            if (0 == parenthesisCounter && op == expression.charAt(expressionIndex))
            {
                // build an operator node
                OperatorNode operatorNode = new OperatorNode(expression.charAt(expressionIndex));
                // and start over with the left and right sub-expressions
                operatorNode.SetNodeLeft(Compile(expression.substring(0, expressionIndex)));
                operatorNode.SetNodeRight(Compile(expression.substring(expressionIndex + 1)));
                return operatorNode;
            }
        }

        // if the counter is not at 0 something was off
        if (parenthesisCounter != 0)
        {
        	System.out.println("Check Parenthesis!");
        }
        // we did not find the operator
        return null;
    }
	
	public double Evaluate()
    {
        return root.Evaluate();
    }
	
	public Node GetRoot()
	{
		return root;
	}
}
