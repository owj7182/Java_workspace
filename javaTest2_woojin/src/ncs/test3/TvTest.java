package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		
		
		for (Tv tv : tvArray) {
			System.out.println(tv);
		}
        int maxPrice = Integer.MIN_VALUE;
        String expensive = "";
        for (Tv tv : tvArray) {
            if (tv.getPrice() > maxPrice) {
                maxPrice = tv.getPrice();
                expensive = tv.getName();
            }
        }

        int minPrice = Integer.MAX_VALUE;
        String cheap = "";
        for (Tv tv : tvArray) {
            if (tv.getPrice() < minPrice) {
                minPrice = tv.getPrice();
                cheap = tv.getName();
            }
        }

        System.out.println("가격이 가장 비싼 제품: " + expensive);
        System.out.println("가격이 가장 저렴한 제품: " + cheap);
    }		
			
		
	

}
