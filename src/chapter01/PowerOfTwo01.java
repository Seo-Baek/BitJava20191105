package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);			//program�� �ܺ� �ڿ��� �̿��Ͽ� ��� ��, �ݳ��� �ؾ��� close�� ���ߴٰ� ����� ��.
		System.out.print("�¼�: ");
		int power = scanner.nextInt(); // blocking
		
		long result = 1;
		int i = 0;
		while(i < power) {
			result = result *2;
			
			i++;
		}
				
		System.out.println("2��" + power + "����" + result + "�Դϴ�.");
		
		scanner.close();

	}

}