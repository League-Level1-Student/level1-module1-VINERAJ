package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavour = JOptionPane.showInputDialog("What flavor do you want your popcorn to be?");
	Popcorn pop = new Popcorn(flavour);
	String tocc = JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
	int tocck = Integer.parseInt(tocc);
	Microwave mike = new Microwave();
	mike.putInMicrowave(pop);
	mike.setTime(tocck);
	mike.startMicrowave();
}
}
