package BrickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame app_frame = new JFrame();
		Gameplay gameplay = new Gameplay();
		app_frame.setBounds(10,10,700,600);
		app_frame.setTitle("Brick Breaker");
		app_frame.add(gameplay);
		app_frame.setResizable(false);
		app_frame.setVisible(true);
		app_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
