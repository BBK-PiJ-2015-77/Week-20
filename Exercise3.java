import java.util.*;
import java.util.stream.*;
import java.util.List;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("hi", "hello", "bonjour", "guttentag", "yo");
		
		List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
		
		System.out.println("Exciting Words: ");
		Stream<String> excitingMap = excitingWords.stream().map(w -> ("  " + w));
		excitingMap.forEach(w -> System.out.println(w));
		System.out.println();
		
		List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
		
		System.out.println("Eye Words: ");
		Stream<String> eyeMap = eyeWords.stream().map(w -> ("  " + w));
		eyeMap.forEach(w -> System.out.println(w));
		System.out.println();
		
		List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
		
		System.out.println("Upper Case Words: ");
		Stream<String> ucMap = upperCaseWords.stream().map(w -> ("  " + w));
		ucMap.forEach(w -> System.out.println(w));
		System.out.println();
		
	}
	
}