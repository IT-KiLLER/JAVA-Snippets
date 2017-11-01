import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighestNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(50));
		numbers.add(new Integer(2));
		numbers.add(new Integer(1));
		numbers.add(new Integer(9));
	
		
		// [50, 2, 1, 9] to 95021
		Collections.sort(numbers, new Comparator<Integer>() {
		    @Override
		    public int compare(Integer a, Integer b) {
			    String ab = String.format("%d%d", a, b);
			    String ba = String.format("%d%d", b, a);
			    return ba.compareTo(ab);
		     }
		});

		StringBuilder output = new StringBuilder();
		
		numbers.forEach(I -> output.append(I));
		System.out.println(output.toString());
	}
}
