/**
 * Exercises ChainOfNodesList.
 */
public class UserOfList {
	public static void main(String[] args) {
		ChainOfNodesList<String> letters = new ChainOfNodesList<>();
		letters.add("1");
		letters.add("B");
		letters.add("3");
		letters.add("X");
		letters.set(3, "C");
		letters.add("E");
		letters.add("5");
		letters.remove(0);
		letters.remove(1);
		letters.remove(letters.size() - 1);
		letters.add(2, "D");
		letters.add(0, "A");

		System.out.println("List contains " + letters.size() + " Strings.");
		System.out.println("First two Strings are " + letters.get(0) + " and " + letters.get(1) + ".");
		System.out.println(letters);

		for(String letter : letters) {
			System.out.println(letter);
		}

		letters.clear();
		System.out.println(letters);
	}
}