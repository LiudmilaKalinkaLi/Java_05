public class OddIndices {
    public static int[] oddIndices(int[] input) {
        int resultLength = (int) Math.floor(input.length/2);
        int resultIdx = 0;
        int[] result = new int[resultLength];
        for (int i = 1; i < input.length; i += 2) {
            result[resultIdx] = input[i];
            resultIdx++;
        }
        return result;
    }
}
