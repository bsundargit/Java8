import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ForEach {

	public static void main(String[] args) {

		//Normal Way
		Map<String, Integer> map = new HashMap<>();
	      map.put("Key1", 10);
	      map.put("Key2", 20);
	      map.put("Key3", 30);
	      map.put("Key4", 40);
	      map.put("Key5", 50);
	      map.put("Key6", 60);

	      for (Map.Entry<String, Integer> entry : map.entrySet()) {
	          System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
	      }
	      
	      //Java 8 way
	      System.out.println("------- Java 8 Style ---------");
	      map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	      
	      System.out.println("-------Map Has Null---------");
	      //If Map Has Null
	      Map<String, Integer> map1 = new HashMap<>();
	      map1.put("Key1", 10);
	      map1.put("Key2", 20);
	      map1.put("Key3", 30);
	      map1.put(null, 40);
	      map1.put("Key5", null);
	      map1.put("Key16", 60);

	      // ensure map is not null
	      if (map1 != null) {
	          map1.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	      }
	      
	      
	      System.out.println("------- List ---------");
	      List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add(null);
	      list.add("D");
	      list.add("E");

	      // filter null value
	      list.stream()
	              .filter(Objects::nonNull)
	              .forEach(System.out::println);
	      
	      System.out.println("------- List checking if some data is exist or Not ---------");
	      List<String> lines = Arrays.asList("Australia", "America", "Antartica");
	      lines.stream()               // convert list to stream
          		.filter(eachEntry -> "Australia".contains(eachEntry))
          		.forEach(System.out::println);
	      
	}

}
