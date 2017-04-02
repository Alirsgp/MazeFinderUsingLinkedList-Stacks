public class testingPro {
	public static void main (String [] args) {
		System.out.println(removeEveryThirdCharacter(s));
	}

	public static String removeEveryThirdCharacter(String s) {
		for(int i = 2; i < str.length() - 3; i+= 3) {
			s = s.substring(i, i + 1) + s.substring(i + 1);
		}
	}
}