public class Gugudan {
	public static void main (String [] a) {
		int [] result = new int[9];
		for (int i = 0; i <= result.length;  i++) {
			result[0] = 1;
			result[1] = 2;
			result[2] = 3;
			result[3] = 4;
			result[4] = 5;
			result[5] = 6;
			result[6] = 8;
			result[7] = 7;
			result[8] = 9;
		}
		for (int i = 0; i <= result.length; i++) {
			System.out.println(result[i] * 2);
		}
	}
}