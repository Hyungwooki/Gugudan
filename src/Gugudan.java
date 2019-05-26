
public class Gugudan {
	public static void main (String [] args) {
		System.out.println("구구단을 외자! 구구단을 외자!");
		for (int i = 2; i <= 9; i++) {
			System.out.println(i+"단");
			for (int k = 1; k <= 9; k++) {
				System.out.println(i + "*" + k + "=" + i*k);
			}
		}
	}
}