import java.util.Scanner;
public class Gugudan {
public static void main (String [] a) {
	System.out.println("8,9단 조건문, while, for 구문 연습");
	System.out.println("구구단을 외자! 구구단을 외자!");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println("당신이 입력한 수는 :" +number);
	
	if (number < 2) {
		System.out.println("오류 error");
	} else if (number > 9) {
		System.out.println("오류 error");
	} else {
		int i = 1;
		while (i < 10) {
			System.out.println(number * i);
			i++;
		}
		for (int k = 1; k < 10; k ++) {
			System.out.println(number * k);
		}
	}
}
}