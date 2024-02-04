import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;

public class GUIDemo4 implements ActionListener {

	private JFrame frame;
	private JTextArea txtScreen;
	private JButton bttn0, bttn1, bttn2, bttn3,
			bttnDiv, bttnMul;

	public GUIDemo4() {

		//create CONTAINER
		frame = new JFrame("GUI Demo");
		
		//create COMPONENTS
		txtScreen = new JTextArea();

		bttn0 = new JButton("0");
		bttn1 = new JButton("1");
		bttn2 = new JButton("2");
		bttn3 = new JButton("3");

		bttnDiv = new JButton("/");
		bttnMul = new JButton("*");



		//frame attribute
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,550);
		frame.setResizable(false);
		frame.setLayout(null);

		//text screen attribute
		txtScreen.setSize(200,50);
		txtScreen.setLocation(5,30);
		txtScreen.setEditable(true);
	
		//button attribute
	        bttn0.setLocation(20,100);
                bttn0.setSize(50,50);
                bttn0.setVisible(true);

		bttn1.setLocation(80,100);
		bttn1.setSize(50,50);
		bttn1.setVisible(true);

		bttn2.setLocation(140,100);
		bttn2.setSize(50,50);
		bttn2.setVisible(true);

		bttn3.setLocation(200,100);
		bttn3.setSize(50,50);
		bttn3.setVisible(true);

		bttnDiv.setLocation(140,200);
		bttnDiv.setSize(50,50);
		bttnDiv.setVisible(true);

		//add COMPONENTS in CONTAINER
		frame.add(txtScreen);
		frame.add(bttn0);
		frame.add(bttn1);
		frame.add(bttn2);
              frame.add(bttn3);
              frame.add(bttnDiv);
              frame.add(bttnMul);

		//add Listener
		bttn0.addActionListener(this);
		bttn1.addActionListener(this);
		bttn2.addActionListener(this);
		bttn3.addActionListener(this);

	}


	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();

                if (obj == bttn0) {
                        txtScreen.setText("Im just a button 1");
                } else if (obj == bttn1) {
                        txtScreen.setText("Im just a button 1");
                }

	}

	public static void main(String[] args) {
		new GUIDemo4();
	}
}
