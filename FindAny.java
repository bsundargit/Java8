import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {

	public static void main(String args[]) 
	{
		//The method returns an Optional instance, which is empty if the Stream is empty:
		
		
		//findAny() is a terminal-short-circuiting operation of Stream interface. 
		//This method returns any first element satisfying the intermediate operations. 
		//This is a short-circuit operation because it just needs ‘any’ first element to be 
		//returned and terminate the rest of the iteration.
		
		List<String> list = Arrays.asList("Array","Break","Continue","DoWhile");
		Optional<String> result = list.stream().findAny();
		System.out.println(result.get());

		
		
	}
}
