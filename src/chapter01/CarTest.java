package chapter01;

public class CarTest {

	public static void main(String[] args) {
	
		Bus bus = new Bus();
		bus.run();
		
		// �ڽ� ��ü�� �θ� Ÿ������ ������ �� �ִ�.
		// ��ü���� Ȯ���� �����ϱ� ���ؼ��� �̰��� �ڿ��������� �Ѵ�. ��> ��� ���迡���� �̷��� ����Ѵ�!
		Car c = new Bus();
		c.run();
		
		// ����
		// Bus b = new Car();
		// ���� ���� ū ���� �� �� �����ϱ�.

		Bus bus2 = new Bus();
		bus2.run();
		bus2.info();
		
		Car c2 = new Bus();
		c2.run();
		((Bus) c2).info();
		
		
		
	}//main

}//class