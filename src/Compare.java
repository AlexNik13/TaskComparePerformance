public class Compare {
    public static final String STR_PLUS = "string";
    public static final int COUNT = 100000;

    public static void main(String[] args) {
        long measure = stringPlusMeasure(COUNT, STR_PLUS);
        printResult("String +", measure, COUNT);

        measure = stringConcatMeasure(COUNT, STR_PLUS);
        printResult("String.concat", measure, COUNT);

        measure = stringBufferMeasure(COUNT, STR_PLUS);
        printResult("StringBuffer", measure, COUNT);

        measure = stringBuilderMeasure(COUNT, STR_PLUS);
        printResult("StringBuilder", measure, COUNT);
    }

    private static long stringBuilderMeasure(int count, String string) {
        StringBuilder strBuilder = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            strBuilder.append(string);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static long stringBufferMeasure(int count, String string) {
        StringBuffer strBuffer = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            strBuffer.append(string);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static long stringConcatMeasure(int count, String string) {
        String str = string;
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            str = str.concat(string);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static long stringPlusMeasure(int count, String string) {
        String str = string;
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            str += string;
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static void printResult(String builder, long nanoSeconds, int count) {
        System.out.println("\n" + builder + " на " + count + " повторений:");
        System.out.println("Наносекунд: " + nanoSeconds);
        System.out.printf("Милисекунд: %.2f\n", nanoSeconds / 1000000.0);
        System.out.printf("Секунд: %.2f\n", nanoSeconds / 1000000000.0);
    }

}
