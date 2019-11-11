package chapter01;

public class Gugudan1 {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			System.out.println(i + "´Ü");
			
			int j = 1;
			while (j < 10) {
				System.out.println(i + " X " + j + " = " + i * j);
				
				j++;
			}
			System.out.println("=======================");
			
			i++;
			
		}

	}

}
