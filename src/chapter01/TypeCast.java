package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// implicity (암묵적) Type Cast
		int i = 10;
		long l = i;
		
		System.out.println(i + ":" + l);
		
		// explicity (명시적) Type Cast
		long l2 = 123456789L;
		int i2 = (int)l2;		//명시적으로 캐스팅을 해도 경고표시가 생성된다

	}

}
