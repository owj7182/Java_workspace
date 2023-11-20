package ncs_javaTest2.kh.model.vo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Food implements Serializable {

	private String name;

	private int kcal;

	public Food() {}

	public Food(String name, int kcal) {

		this.name = name;

		this.kcal = kcal;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getKcal() {

		return kcal;

	}

	public void setKcal(int kcal) {

		this.kcal = kcal;

	}

	@Override

	public String toString() {

		return name + "(" + kcal + "kcal)";

	}
	public static void main(String[] args) {
		Food test = new Food();
		test.fileSave("Food");
	}
	
	public void fileSave(String fileName) {

		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(fileName));){

			objOut.writeObject(new Food("사과", 20));

		}catch(Exception e){

			e.printStackTrace();

		}

		} //fileSave() close

}
