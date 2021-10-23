import java.util.ArrayList;
import java.util.List;

public class removeIf {

	public static void main(String[] args)
	{
		// Java 8 has an important in-built functional interface which is Predicate. 
		// Predicate, or a condition checking function, check the given input for a given condition 
		// and returns a boolean result for the same indicating whether the condition was met or not.
		
		
		List<String> cityNames = new ArrayList<String>();
		cityNames.add("Singapore");
		cityNames.add("Seol");
		cityNames.add("Bengalurur");
		cityNames.removeIf(name -> name.contains("S"));
		
		cityNames.forEach(System.out::println);

		cityNames.forEach(var -> {
			System.out.println(var);
		});
		
	}
}
