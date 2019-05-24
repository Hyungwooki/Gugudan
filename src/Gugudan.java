import java.util.Scanner;
public class Gugudan {
	public static void main (String [] a) {
		System.out.println("조건문 및 for구문 연습");
		System.out.println("구구단을 외자! 구구단을 외자! : ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println("사용자가 입력한 값은 : " +number);
			
			if (number < 2) {
				System.out.println("오류 error");
			} else if (number > 9) {
				System.out.println("오류 error");
			} else {
				for (int i = 1; i <10; i ++) { // i = i + 1
					System.out.println(number * i);
				}
			}
	}
}