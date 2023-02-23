import java.util.ArrayList;

public class test {

	static ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				arr.add("FizzBuzz");
			else if (i % 3 == 0)
				arr.add("Fizz");
			else if (i % 5 == 0)
				arr.add("Buzz");
			else
				arr.add(Integer.toString(i));
		}
		return arr;
	}

	public static void main(String[] args) {
		int n = 15;
		ArrayList<String> ans = fizzBuzz(n);
		for (String s : ans)
			System.out.print(s + " ");
		System.out.println();
	}
}