// e.g void perm (String str, String result){
// }

public class PERMUTATION_0F_STRING {

	private static void permutation(String str, String res) {
		if(str.length() == 0) {
			System.out.println("Result : "+res);
			return;
		}
		char firstChar = str.charAt(0);
		String smallString = str.substring(1);
		permutation(smallString, firstChar+res);
		permutation(smallString, res+firstChar);
	}
	public static void main(String[] args) {
		permutation("abc","");
	}

}
