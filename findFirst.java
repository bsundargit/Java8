import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirst {

	static public void main(String[] args) {
		
		List<String> list = Arrays.asList("Break", "Arrays", "Concurrent", "Deadlock");
	    Optional<String> result = list.stream().findFirst();
	    System.out.println(result.get());
	}
}
