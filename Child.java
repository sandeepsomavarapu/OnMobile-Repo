import java.util.Date;

interface SuperParent1 // 100%
{
	void m1();// public abstract void m1();

}

abstract class Parent implements SuperParent1 { // 0-100 %
	public void displayDate() {
		System.out.println("Today's Date :" + new Date());
	}

	public abstract void displayMsg();
}

public class Child extends Parent {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.displayDate();
		ch.displayMsg();
		ch.m1();
	}

	@Override
	public void displayMsg() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}
