package _05_vault;

public class JamesVaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault(98765);
		JamesBond james = new JamesBond();
		System.out.println("The code is: " + james.findCode(vault)+ "!!!");
	}
}
