package examen.revision;

import javax.swing.JFrame;

public class Main  {
	
	
	
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Android");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		  Graphisme graphisme = new Graphisme();
			frame.add(graphisme);
			frame.setVisible(true);
	
		
		
	}

}
