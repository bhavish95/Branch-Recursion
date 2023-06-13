public class PERMUTATION_0F_STRING {
    public static void main(String[] args) {
        String input = "abc";
        perm(input, "");
    }

    static void perm(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            perm(newStr, result + currentChar);
        }
    }
}
