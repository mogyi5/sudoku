import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


//gui to show sudoku - numbers, solve button, reset, error message

public class View extends JFrame{
	
	JPanel v_topPanel;			// Three panels in the frame: top, middle and bottom. 
	JPanel v_middlePanel;
	JPanel v_bottomPanel;
	
	private JButton v_solveBtn = new JButton("Solve");	
	private JButton v_resetBtn = new JButton("Reset");	
	protected JTextField v_errorTF = new JTextField(35);		

	
	View(Model model) {	
		

		v_topPanel = new JPanel();	
		
		v_middlePanel = new JPanel();	
		v_solveBtn.setPreferredSize(new Dimension(100,30));
		v_middlePanel.add(v_solveBtn);
		v_resetBtn.setPreferredSize(new Dimension(100,30));
		v_middlePanel.add(v_resetBtn);
		
		v_bottomPanel = new JPanel();				
		v_errorTF.setEditable(false);			
//		v_errorTF.setText("<Select a trade to \n view its details>");
		v_bottomPanel.add(v_errorTF);
		
		this.setLocation(450, 150);					
		this.setLayout(new BorderLayout());	
		
		this.add(v_topPanel, BorderLayout.PAGE_START);
		this.add(v_middlePanel, BorderLayout.CENTER);
		this.add(v_bottomPanel, BorderLayout.PAGE_END);
		
		this.setTitle("Sudoku Solver");					
		this.pack();	
	}
	
	
	


}
