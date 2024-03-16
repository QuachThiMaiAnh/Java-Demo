package Hello;

import java.util.Scanner;

public class CauLenhDieuKien {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số tiền thuế là: ");
		double money = scanner.nextDouble();
		if (money < 10) {
			System.out.println("Không cần đóng thuế!!");
		} else if (money <= 15) {
			System.out.printf("Tiền thuế là %.0f đồng", money * 0.1 * 1000000);
		} else if (money <= 30) {
			System.out.println("Tiền thuế là " + money * 0.2);
		} else {
			System.out.println("Tiền thuế là " + money * 0.5);
		}
		scanner.close();
	}
}
