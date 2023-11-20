package sh.java.oop.field;

public class XiaomiPhoneMain {

	/**
	 * 홍길동 01012345678
	 * 신사임당 01033334444
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("시작!!!!");
		
		XiaomiPhone hongPhone = new XiaomiPhone();
		hongPhone.setOwner("홍길동");
		hongPhone.setNumber("01012345678");
		
		XiaomiPhone sinPhone = new XiaomiPhone();
		sinPhone.setOwner("신사임당");
		sinPhone.setNumber("01033334444");
		
		System.out.printf("%s %s\n", hongPhone.getOwner(), hongPhone.getNumber());
		System.out.printf("%s %s\n", sinPhone.getOwner(), sinPhone.getNumber());
		
		// 클래스변수 사용 : 객체생성 없이 클래스명으로 접근
		System.out.println(XiaomiPhone.weight);
		System.out.println(XiaomiPhone.size[0] + "/" + XiaomiPhone.size[1] + "/" + XiaomiPhone.size[2]);
		
//		System.out.println(sinPhone.weight);
		
	}

}
