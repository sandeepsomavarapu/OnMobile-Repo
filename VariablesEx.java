//ctrl+shift+f to format file 
//ctrl+shift+o to manage imports
//ctrl+/ for comments 
//ctrl+shift+/	for multi line comments


public class VariablesEx {

	int salary = 23000;// instance,global JVM heap ,method area
	static String orgname = "onmobile";// static ,global .class load into jvm java classname

	public static void main(String[] args) {
		System.out.println("am from static method");
		float marks = 234.4f;// local variable

		System.out.println(marks);

		System.out.println(VariablesEx.orgname);

		VariablesEx obj = new VariablesEx();

		System.out.println(obj.salary);

	}


}
