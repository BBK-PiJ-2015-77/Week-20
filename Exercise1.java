import java.util.*;
import java.util.stream.*;
import java.util.List;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		//StringBuilder sb = new StringBuilder();
		
		List<String> words = Arrays.asList("hi", "hello", "bonjour", "guttentag", "yo");
		
		words.stream().forEach(w -> System.out.println("  " + w));
		System.out.println();
		
	}
	
}