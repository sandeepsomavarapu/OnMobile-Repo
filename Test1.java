import java.util.function.Function;
import java.util.function.Predicate;
public class Test1 {
	public static void main(String[] args) {
		Predicate<Integer> predicate=a->a%2==0;
		System.out.println(predicate.test(12));
		
		Predicate<String>predicate1=name->name.length()>6;
		System.out.println(predicate1.test("sandeep"));
		
		Function<String,Integer> function=name->name.length();
		System.out.println(function.apply("sandeep"));
		
		Function<String,String> function1=name->name.toUpperCase();
		System.out.println(function1.apply("sandeep"));
	}
}
