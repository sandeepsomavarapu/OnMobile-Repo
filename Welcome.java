import java.util.Date;

class SuperParent {
	public void displayMessage() {
		System.out.println("am from super parent class ");
	}

}

class Caluculator extends SuperParent {

	public void displayDate() {

		System.out.println("Today's Date : " + new Date());
	}
}

public class Welcome extends SuperParent {

	void m1() {
		System.out.println("am from welcome class m1 mehod ...");
	}

	public static void main(String[] args) {
		System.out.println("welcome to java");
		Welcome wel = new Welcome();
		wel.m1();
		//wel.displayDate();
		wel.displayMessage();

	}
}
