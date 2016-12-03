import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class Main {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private int number;

	public Main(){
		prepareGUI();
		attachBtn();
	}
	
	public int getNumber() {
		return number;
	}

	public static void main(String[] args){
		Main main = new Main();  
	}
		
	public void prepareGUI(){
		mainFrame = new JFrame("Java Swing Counter");
		mainFrame.setSize(400,200);
		mainFrame.setLayout(new GridLayout(3, 1));

		headerLabel = new JLabel("",JLabel.CENTER );
		statusLabel = new JLabel("",JLabel.CENTER);		  

		statusLabel.setSize(400,100);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
			  System.exit(0);
			}		  
		});	 
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);  
	}

	public void attachBtn(){
		headerLabel.setText("Java Swing Counter"); 

		JButton addBtn = new JButton("add");
		JButton subtractBtn = new JButton("subtract");

		addBtn.setActionCommand("add");
		subtractBtn.setActionCommand("subtract");

		addBtn.addActionListener(new ButtonClickListener()); 
		subtractBtn.addActionListener(new ButtonClickListener()); 

		controlPanel.add(addBtn);
		controlPanel.add(subtractBtn);

		number = 0;
		statusLabel.setText("0");
		mainFrame.setVisible(true);  
	}

	public class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			/*
			 * 여기에 코드를 작성하세요.
			 */
			String s = e.getActionCommand();

			if (s.equals("add"))
			{
				//add
				number++;
			}
			else
			{
				//subtract
				number--;
			}
			statusLabel.setText(number+"");
		}
	}
}