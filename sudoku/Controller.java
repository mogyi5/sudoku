import java.awt.Shape;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Controller {
	
	private Model c_model;			// Objects for the model, view and graph.
	private View c_view;
	
	Controller(Model model, View view) {    // Constructor.
		this.c_model = model;
		this.c_view = view;
//		c_graph = view.getGraph();

//		view.addQuitListener(new QuitListener());			// Add all listeners to view and graph. 
//		view.addBrowserListener(new BrowserListener());
//		view.addComboListener(new ComboListener());
//		c_graph.addMouseListener(new ClickListener());
//		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void Reset() {
		//wipe everything
	}
	
	public void Solve() {
		//solve the puzzle, maybe break down to further component
	}
	
	public void ErrorShow() {
		//show the error as to why the puzzle cant be solved
	}

	
}
