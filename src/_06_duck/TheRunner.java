package _06_duck;

public class TheRunner {
public static void main(String[] args) {
	Duck duck = new Duck(0, "human flesh");
	duck.quack();
	duck.waddle();
	Axolotl ax = new Axolotl(12345, "Fred");
	ax.regenerate();
	ax.swimAway();
}
}
