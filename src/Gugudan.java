public class Gugudan {
	public static void main (String [] a) {
		int[] array = new int[9];
		for (int k = 2; k <= 9; k ++) {
			for(int i = 0; i < array.length; i ++) {
				array[i] = k * (i + 1);
			}
			for (int i = 0; i < array.length; i ++) {
				System.out.println(array[i]);
			}
		}
	}
}