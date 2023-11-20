package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		
		  bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		  bArray[1] = new Book("열형강의 자바", "구정은", 29000, "프리렉", 0.1);
		  bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		  
		  
		  for (int i = 0; i < bArray.length; i++) {
			  System.out.print(bArray[i].getTittle() + ", ");
			  System.out.print(bArray[i].getAuthor() + ", ");
			  System.out.print(bArray[i].getPublisher() + ", ");
			  System.out.print(bArray[i].getPrice() + "원, ");
			  System.out.println((int)(bArray[i].getDiscountRate() * 100) + "% 할인");
			  System.out.println("할인된 가격 : " + ((int)(bArray[i].getPrice() - (bArray[i].getPrice() * bArray[i].getDiscountRate()))) + "원");
			  
		  }
		  
	}

}
