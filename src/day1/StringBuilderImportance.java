package day1;

public class StringBuilderImportance {

	public static void main(String[] args) {

		// Strings in JAVA are immutable, hence, when we do operations
		// such as concatenation, the concatenated string is stored as a
		// new one in the memory, and the old one also remains in memory.
		// This becomes very inefficient when we are doing a large number
		// of string manipulation operations. Hence, we use StringBuilder.

		String s1 = "John";
		String s2 = "Doe";

		s1 = s1 + " " + s2; // It forms a new string and "John" still remains in memory.
		System.out.println(s1);

		StringBuilder sb = new StringBuilder(s1);

		// The append operations happen on the same 'sb' object created initially.
		// Hence, it is more efficient.
		sb.append(" ");
		sb.append(s2);

		System.out.println(sb.toString());

	}

}
