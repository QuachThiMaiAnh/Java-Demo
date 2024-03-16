package Hello;

import java.util.Scanner;

public class Hello2 {
	public static void main(String[] args) {
//		Thư viện cho phép nhận một gì đó từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào chiều dài HCN: ");
		double dai = scanner.nextDouble();
		System.out.println("Nhập vào chiều rộng HCN: ");
		double rong = scanner.nextDouble();
		double cv = (dai + rong) * 2;
		double dt = (dai * rong);
		double minHCN = Math.min(dai, rong);
		System.out.println("Chu vi HCN = " + cv + " m");
		System.out.println("Diện tích HCN = " + dt + " m");
		System.out.println("Cạnh nhỏ nhất HCN = " + minHCN + " m");
		scanner.close();
	}
}
