package chapter01;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/*
				 * �⺻Ÿ��(Primitive Type 8)
				 */
				//����
				byte b = 1;
				short s = 10;
				int i = 2000;      //��  literal�̶���Ѵ�
				long l = 1234567890L;
				
				//�Ǽ�
				float f = 3.14f;
				double d = 3.14;
				
				//����
				char c = 'A';
				char c2 = 65;
				
				//�Ҹ�
				boolean bool = true;
				boolean bool2 = false;
				
				System.out.println(b);
				System.out.println(s);
				System.out.println(i);
				System.out.println(l);
				System.out.println(f);
				System.out.println(d);
				System.out.println(c);
				System.out.println(c2);
				System.out.println(bool);
				System.out.println(bool2);
				
				/*
				 *  ������(reference type)
				 */
				// ���ڿ��� �⺻Ÿ���� �ƴϴ�.
				// ���ڿ��� �⺻Ÿ�� char�� �� �ִ� String Ŭ������ ��ü��. (����ü)
				String str = "hello";
				System.out.println(str.length());
				
				// �������� �ʱ�ȭ�� �Ǿ�� �Ѵ�.
				// �ȵǾ� �ִ� ���·� ����ϸ� ����.
				int j = 0;   // = 0�� ���� ���� �ʱ�ȭ��!
				
				
				System.out.println(j);
				
				/*
				 * ���
				 */
				final int NUMBER = 10;  // ����� �򰥸��� �ʱ� ���� �빮�ڷ� ����
				System.out.println(number);
				// ����
				// �ʱ�ȭ�� �� final�� �پ� �ִ� ������ 
				// �ʱ�ȭ ���ĺ��ʹ� ���� ������ �� ����.
				//number = 100;			
				
	}

}
