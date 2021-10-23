import java.util.Optional;

public class OptionalClass {

	public static void main(String args[])
	{
		
		/*“Optional” is a public final class and is used to deal with NullPointerException in the Java application. 
		 * Using Optional, you can specify alternate code or values to run. By using Optional you don’t have to use too many null checks to avoid nullPointerException.

		You can use the Optional class to avoid abnormal termination of the program and prevent the program from crashing. 
		The Optional class provides methods that are used to check the presence of value for a particular variable.
		*/
		
		
		String aInMemoryIntervalMins= "192";
		//Take the Ints from this package - import com.google.common.primitives.Ints;
		//int intervalMinutes = Optional
                //.ofNullable(aInMemoryIntervalMins)
                //.map(Integer::tryParse)
                //orElse(30);
		
		String str[] = {"1","2","3","4","5"};
		Optional<String>checkNull =  Optional.ofNullable(str[2]);
		if(checkNull.isPresent()) {
			System.out.println(checkNull.get());
		}
		
		//Example
		
	//	Optional<YourOwnClass> match = classConfiguration
    //            .stream()
    //            .filter(element -> element.getConfigName().equals(config))
    //            .findFirst();
    //    configsToPack.add(match.get());
		
    // use .get method to obtain the result.		
		
	}
}
