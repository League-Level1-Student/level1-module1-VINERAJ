package _06_duck;

public class Duck {
	private int numberOfFriends;
	private String favoriteFood;
	
	public Duck(int numberOfFriends, String favoriteFood) {
		this.numberOfFriends=numberOfFriends;
		this.favoriteFood=favoriteFood;
	}
	
	void quack() {
		System.out.println("QUUUUUUUUUUUUUAAAAAAAAAAAAACCCCK");
	}
	void waddle() {
		System.out.println("The duck waddles towards you and attempts to peck your eye out.");
	}
}
