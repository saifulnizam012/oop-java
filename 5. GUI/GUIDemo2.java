import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class GUIDemo2 extends JFrame {
	private JFrame frame;
	private JButton bttn0;
	private JTextArea txtScreen;


        public GUIDemo2() {
                //create Containers
		frame = new JFrame("GUI Demo");

                //create Components
		txtScreen = new JTextArea();
		bttn0 = new JButton("0");


		//text screen attribute
		txtScreen.setSize(100,50);
		txtScreen.setLocation(5,30);
		txtScreen.setEditable(true);

		//butt0 attribute
		bttn0.setLocation(140,200);
		bttn0.setSize(50,50);
		bttn0.setVisible(true);

		//frame attribute
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,550);
		frame.setResizable(false);
		frame.setLayout(null);

	         //add Components in container
		frame.add(txtScreen);
 		frame.add(bttn0);
        }


        public static void main(String[] args) {

                new GUIDemo2();
        }

}

