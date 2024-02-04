import javax.swing.JFrame;

public class GUIDemo1 extends JFrame {
	private JFrame frame;


        public GUIDemo1() {
                //create Container
		frame = new JFrame("GUI Demo");

                //create Components
                //add Components in container

		//frame attribute
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,550);
		frame.setResizable(false);
		frame.setLayout(null);

        }


        public static void main(String[] args) {

                new GUIDemo1();
        }

}

