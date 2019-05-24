import java.util.Scanner;
public class Gugudan {
	public static void main (String [] a) {
		System.out.println("8,9단 값 입력 및 조건문 연습");
		System.out.println("구구단을 외자 구구단을 외자 ! : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " +number);
		
		if (number < 2) {
			System.out.println("값을 잘못 입력했습니다");
		} else if(number > 9) {
			System.out.println("값을 잘못 입력했습니다");
		} else {
			for (int i = 1; i < 10; i ++) {
				System.out.println(number * i);
				}
		}
	}
}