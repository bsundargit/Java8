import java.util.HashMap;
import java.util.Map;

public class MapReplaceAll {

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<>();
	     studentMap.put(101, "India");
	     studentMap.put(102, "Australia");
	     studentMap.put(103, "UnitedKingdom");

	     System.out.println("--- before replaceAll() ---");
	     System.out.println(studentMap);

	     studentMap.replaceAll((k,v) -> {
	       if (k == 102) {
	         return v + "-" + k;
	       }
	       return v;
	     });

	     System.out.println("--- after replaceAll() ---");
	     System.out.println(studentMap);
	}

}
