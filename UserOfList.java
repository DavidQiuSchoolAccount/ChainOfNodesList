/**
 * Exercises ChainOfNodesList.
 */
public class UserOfList {
	public static void main(String[] args) {
		ChainOfNodesList<String> letters = new ChainOfNodesList<>();
		letters.add("A");
		letters.add("B");
		letters.add("X");
		letters.set(2, "C");
		letters.add("D");

		System.out.println("List contains " + letters.size() + " Strings.");
		System.out.println("First two Strings are " + letters.get(0) + " and " + letters.get(1) + ".");
		System.out.println(letters); // ["A", "B", "C", "D"]

		for(String letter : letters) {
			System.out.println(letter);
		}

		letters.clear();
		System.out.println(letters);
	}
}