import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("Teja");
		names.add("Raja");

		if (names.add("Teja")) {
			System.out.println("Teja is exist");
		}

		if (!names.add("Raja")) {
			System.out.println("ABD is added");
		}
	}

}
