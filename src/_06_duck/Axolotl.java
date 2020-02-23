package _06_duck;

public class Axolotl {
	int age;
	String name;
	
	public Axolotl(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	void regenerate() {
		System.out.println("The axolotl regenerated its damage");
	}
	
	void swimAway() {
		System.out.println("The axolotl tires of your mortal hijinks and leaves");
	}
}
