package Hello;

import java.util.Scanner;

public class Hello3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào chiều dài cạnh lập phương: ");
		double dai = scanner.nextDouble();
		System.out.println("Thể tích hình lập phương bằng : " + Math.pow(dai, 3));
	}

}
