import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class GUIDemo3 {

	private JFrame frame;
	private JTextArea txtScreen;
	private JButton[] bttnDigit;
	private JButton bttnDiv, bttnMul;

	public GUIDemo3() {

		//create CONTAINER
		frame = new JFrame("GUI Demo");
		
		//create COMPONENTS
		txtScreen = new JTextArea();

		bttnDigit = new JButton[10];
		String tmp;
		for (int i=0; i<10; i++) {
			tmp=Integer.toString(i);
			bttnDigit[i] = new JButton(tmp);
		}

		bttnDiv = new JButton("/");
		bttnMul = new JButton("*");



		//frame attribute
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,550);
		frame.setResizable(true);
		frame.setLayout(null);

		//text screen attribute
		txtScreen.setSize(100,50);
		txtScreen.setLocation(5,30);
		txtScreen.setEditable(true);
	
		//button attribute
		for (int i=0; i<10; i++) {
		        bttnDigit[i].setLocation(20+60*i,100);
        	        bttnDigit[i].setSize(50,50);
                	bttnDigit[i].setVisible(true);
		}

		bttnDiv.setLocation(140,200);
		bttnDiv.setSize(50,50);
		bttnDiv.setVisible(true);

		//add COMPONENTS in CONTAINER
		frame.add(txtScreen);
		
		for (int i=0; i<10; i++)
			frame.add(bttnDigit[i]);
                frame.add(bttnDiv);
                frame.add(bttnMul);

	}

	public static void main(String[] args) {
		new GUIDemo3();
	}
}
