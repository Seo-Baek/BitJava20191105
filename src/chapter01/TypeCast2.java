package chapter01;

public class TypeCast2 {
	
	public static void main(String args[]){
		
		byte b;
		int i = 414;
		float f = (float)123.456;
		
		b = (byte)i;
		System.out.println("int 414를 byte로 변환 : " + b); //2의 보수값으로 반환
		i = (int)f;
		System.out.println("float 123.456을 int로 변환: " + i);
		b = (byte)f;
		System.out.println("float 123.456을 byte로 변환: " + b);
		
	
	}

}
