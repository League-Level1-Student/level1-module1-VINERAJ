package _05_vault;

public class JamesBond {
	
	public JamesBond() {
		System.out.println("James Bond has arrived!!!");
	}
	
	int findCode(Vault vault) {
		int code = vault.getCode();
		for (int i = 0; i < 999999; i++) {
			if (i == code) {
				return i;
			}
		}
		return -1;
	}
}
