package ncs.test6;

public class Calculate {
	public Calculate(){}
	public int sum(int a, int b){ 
		return a + b;
	}
	public int subtract(int a, int b){
		return a - b;
	}
	public int multiply(int a, int b){
		return a * b;
	}
	public int divide(int a, int b){
		if (b != 0) {
		return a / b;
		}
		else {
			System.out.println("0으로 나눌수 없습니다.");
			return 0;
		}
	} 
	
}
