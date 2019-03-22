/**
 * Exercises ChainOfNodesList.
 */
public class UserOfList {
	public static void main(String[] args) {
		ChainOfNodesList<String> list = new ChainOfNodesList<>();
		list.add("abc");
		list.add("def");
		list.add("ghi");

		System.out.println("List contains " + list.size() + " Strings.");
		System.out.println(list.get(0));  // "abc"
		System.out.println(list.get(1));  // "def"
		System.out.println(list.get(2));  // "ghi"
		System.out.println(list.get(3));  // NoSuchElementException
		System.out.println(list.get(-1)); // NoSuchElementException
	}
}