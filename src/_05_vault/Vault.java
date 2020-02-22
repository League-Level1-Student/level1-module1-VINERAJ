package _05_vault;

public class Vault {
	private int code;

	public Vault(int code) {
		if (code > 1000000) {
			System.out.println("Choose another code!");
		} else if (code < 0) {
			System.out.println("Choose another code!");
		} else {
			System.out.println("A new vault has been created!");
			this.code = code;
		}
	}

	public int getCode() {
		return this.code;
	}

	boolean tryCode(int guess) {
		if (guess == code) {
			return true;
		} else {
			return false;
		}
	}
}
