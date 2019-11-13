package Parking;

public abstract class Car implements Parkable {
//	abstract void park(); // 추상클래스!!  구현이 안됨 (단순 확장성 때문에 생성된 클래스)
		int speed;
		void run() {
			System.out.println("달리다.");
	}

}
