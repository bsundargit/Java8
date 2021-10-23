import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapComputeComputeIfPresentIfAbsent {

	public static void main(String[] args) {
		
		Map<String,Integer> m1 = new HashMap();
		m1.put("key1", 1);
		m1.put("key2", 2);
		m1.put("key3", 3);
		
		m1.compute("key1", (k,v) -> v==null?1:v+1);
		
		System.out.println(m1);
		
		//computeIfAbsent - Function IF
		//Represents a function that accepts one argument and produces a result.
		Function<String,Integer> funct = (k) -> 0;
		m1.computeIfAbsent("Key4", funct);
		System.out.println(m1);
		
		
		//computeIfPresent - Function IF
		//Represents a function that accepts two arguments and produces a result.This is the two-arity specialization of 
		BiFunction<String, Integer, Integer> biFunction = (k, v) -> v + 1;
		m1.computeIfPresent("key3", biFunction);
		System.out.println(m1);
		

	}

}
