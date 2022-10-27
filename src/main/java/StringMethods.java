public class StringMethods {
    public static String removeSpaces(String text) {
        if (text == null || text.isEmpty()){
            return "Empty String";
        }
        int len = text.length();
        int trimLen = text.trim().length();
        if (len == trimLen){
            return "Not trimmed";
        } else {
            return "Trimmed";
        }
    }

    public static String countAs(String text) {
        int len = text.length();
        int len1 = text.toLowerCase().replace("a", "").length();
        return String.valueOf(len - len1).concat(", ").concat(String.valueOf(len1));
    }
}
