import java.util.Scanner;
public class Gugudan {
	public static void main (String [] a) {
		
		System.out.println("1부터 9까지 곱해드립니다. 수를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);
		
	}
}