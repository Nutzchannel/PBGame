package net.teampbg.pbgame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class PBGFrame {
	public static void main(String args[]) {
		JFrame PBGFrame = new JFrame("PBGame");
		PBGFrame.setSize(1280, 720);
		PBGFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		PBGFrame.setVisible(true);
	}
}
