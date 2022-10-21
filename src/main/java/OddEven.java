public class OddEven {
    public static String oddEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
        //return number % 2 == 0 ? "Even" : "Odd";
    }
}
