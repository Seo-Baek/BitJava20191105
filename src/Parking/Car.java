package Parking;

public abstract class Car implements Parkable {
//	abstract void park(); // �߻�Ŭ����!!  ������ �ȵ� (�ܼ� Ȯ�强 ������ ������ Ŭ����)
		int speed;
		void run() {
			System.out.println("�޸���.");
	}

}
