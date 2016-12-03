import java.awt.*;
import java.awt.event.*;

public class AwtMain {

	public Frame mainFrame;
	public Label titleLabel;
	public Label memoLabel;
	public Panel controlPanel;
	public TextField textField;

	public AwtMain(){
		initGUI();
		setComponents();
	}

	public static void main(String[] args){
		AwtMain awtMain = new AwtMain();
	}

	private void initGUI(){
		mainFrame = new Frame("Java AWT");
		mainFrame.setSize(400,270);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}		  
		});	 
		titleLabel = new Label();
		titleLabel.setAlignment(Label.CENTER);
		memoLabel = new Label();		  
		memoLabel.setAlignment(Label.CENTER);
		memoLabel.setSize(350,100);

		controlPanel = new Panel();
		controlPanel.setSize(250, 150);
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(titleLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(memoLabel);
		mainFrame.setVisible(true);  
	}

	private void setComponents(){
		titleLabel.setText("AWT Short Memo holder"); 

		Button okButton = new Button("Save");
		textField = new TextField("", 20);
		
		okButton.setActionCommand("Save");
		okButton.addActionListener(new ButtonClickListener()); 
		
		textField.addKeyListener(new EnterKeyListener());
		
		controlPanel.add(textField);
		controlPanel.add(okButton);
		mainFrame.setVisible(true);  
	}
	
	public class EnterKeyListener implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			/*
			 * 여기에 함수를 구현하세요
			 */
			String s = e.getKeyText(e.getKeyCode());
			if(e.getKeyCode() == KeyEvent.VK_ENTER){ // F1누를시
      	textField.requestFocus();
				memoLabel.setText(textField.getText());
     	}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			/*
			 * 여기에 함수를 구현하세요
			 */
		}
		@Override
		public void keyTyped(KeyEvent e) {
			/*
			 * 여기에 함수를 구현하세요
			 */
		}
	}
	
	public class ButtonClickListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			/*
			 * 여기에 함수를 구현하세요
			 */
		
			memoLabel.setText(textField.getText());
			
		}		
	}
}