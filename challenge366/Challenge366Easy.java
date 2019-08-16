package challenge366;

public class Challenge366Easy {
    public static void main(String[] args) {
        String test = "leaves";
        System.out.println(contains(test, "eaves"));
    }

    public static boolean contains(String word, String substring) {
        StringBuilder wordBuild = new StringBuilder(word);
        StringBuilder ssBuild = new StringBuilder(substring);
        for (int i = 0; i < wordBuild.length(); i++) {
            StringBuilder copy = wordBuild;
            if (equals(ssBuild, copy.deleteCharAt(i))) {
                return true;
            }
        }
        return false;
    }

    //if lengths of StringBuilder are equal, checks if characters are equal
    public static boolean equals(StringBuilder a, StringBuilder b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
