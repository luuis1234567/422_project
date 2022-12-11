package cpts422.calculator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorGUI implements ActionListener {
	 
public calculatorGUI(){}
 
public void actionPerformed (ActionEvent ae ){}
 
public static void main(String[] args) 
{
	JFrame j = new JFrame("Calculator");
	Container c = j.getContentPane();
 
	JPanel panel = new JPanel();
	panel.setLayout(new BorderLayout());
	 
	panel.setLayout(new GridLayout(4,4,4,4));
	JTextField userInput = new JTextField(100);
	Font myFontSize = userInput.getFont().deriveFont(Font.BOLD,40f);
	userInput.setFont(myFontSize);
	c.add(userInput,BorderLayout.NORTH);
 
	JButton n1 = new JButton("1");
	 
	n1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n1.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	});
 
	JButton n2 = new JButton("2");
	n2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n2.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	 
	}
	});
 
	JButton n3 = new JButton("3");
	n3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n3.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton n4 = new JButton("4");
	n4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n4.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	
	});
 
	JButton n5 = new JButton("5");
	n5.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n5.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton n6 = new JButton("6");
	n6.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n6.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton n7 = new JButton("7");
	n7.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
	String tempNum = n7.getText();
	String global = userInput.getText();
	global = global.concat(tempNum);
	userInput.setText(global);
	}
	 
	});
 
	JButton n8 = new JButton("8");
	n8.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n8.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton n9 = new JButton("9");
	n9.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n9.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton n0 = new JButton("0");
	n0.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = n0.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton plusBtn = new JButton("+");
	plusBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	plusBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = plusBtn.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton minusBtn = new JButton("-");
	minusBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	minusBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = minusBtn.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});
 
	JButton multiplyBtn = new JButton("*");
	multiplyBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	multiplyBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = multiplyBtn.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});

	JButton divideBtn = new JButton("/");
	divideBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	divideBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = divideBtn.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});

	JButton powerBtn = new JButton("^");
	powerBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	powerBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = powerBtn.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});

	JButton leftBracket = new JButton("(");
	leftBracket.setFont(new Font("Serif", Font.BOLD, 25));
	
	leftBracket.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = leftBracket.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});

	JButton rightBracket = new JButton(")");
	rightBracket.setFont(new Font("Serif", Font.BOLD, 25));
	
	rightBracket.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = rightBracket.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	
	});

	JButton decimalBtn = new JButton(".");
	decimalBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	decimalBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String tempNum = decimalBtn.getText();
		String global = userInput.getText();
		global = global.concat(tempNum);
		userInput.setText(global);
	}
	 
	});

	JButton equalBtn = new JButton("=");
	equalBtn.setFont(new Font("Serif", Font.BOLD, 25));
	equalBtn.setBackground(Color.ORANGE);
	
	equalBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String global = userInput.getText();
		
		Expression exp = new Expression(global); // Creating a new instance of EXpression to evaluate our input
		DecimalFormat df = new DecimalFormat("#.###"); // round to the nearest 3 decimal places
		df.setRoundingMode(RoundingMode.CEILING);
		
		try 
		{
			Double result = exp.Evaluate(); // find the result of the expression
			String s = df.format(result); // round the result
			userInput.setText(s);
		} 
		catch (Exception error) // if the equal sign is clicked on a non-mathematical-expression
		{
			userInput.setText(null); // clear the user input in the UI
		}
	}
	 
	});

	JButton deleteBtn = new JButton("<");
	deleteBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	deleteBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		String global = userInput.getText();
		global = global.substring(0, global.length()-1); // delete last character of the text in the UI
		userInput.setText(global);
		}
		catch(Exception error) // if the delete button is clicked on an empty input
		{
			userInput.setText(null); // clear the user input in the UI
		
		}
	}
	 
	});

	JButton clearBtn = new JButton("C");
	clearBtn.setFont(new Font("Serif", Font.BOLD, 25));
	
	clearBtn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
	userInput.setText(null);
	}
	 
	});
    
	// adding created buttons to the panel ( the UI )
	panel.add(n1);
	panel.add(n2);
	panel.add(n3);
	panel.add(n4);
	panel.add(n5);
	panel.add(n6);
	panel.add(n7);
	panel.add(n8);
	panel.add(n9);
	panel.add(n0);
	panel.add(plusBtn);
	panel.add(minusBtn);
	panel.add(multiplyBtn);
	panel.add(divideBtn);
	panel.add(powerBtn);
	panel.add(leftBracket);
	panel.add(rightBracket);
	panel.add(decimalBtn);
	panel.add(deleteBtn);
	panel.add(clearBtn);
	panel.add(equalBtn);

 
	c.add(panel,BorderLayout.CENTER);
 
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.setSize(400,400);
	j.setVisible(true);
 
}

}