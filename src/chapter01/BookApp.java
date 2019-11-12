package chapter01;

public class BookApp {
	public static void main(String[] args) {

		//Book book = new Book();  //evernote 에 참조 설명    ()는 객체를 만든것
		
		Book[] bs = new Book[3];   //[] 는 공간만 만든것
		bs[0] = new Book();
		bs[0].title = "A";
		bs[0].price = 1000;
		
		bs[1] = new Book();
		bs[1].title = "B";
		bs[1].price = 2000;

		bs[2] = new Book();
		bs[2].title = "C";
		bs[2].price = 3000;
		
		//bs[0].price = 1000;
		
		for(Book b: bs) {
			System.out.println(b.title + ": " + b.price);
		}
		
		
	}//main
}//class
