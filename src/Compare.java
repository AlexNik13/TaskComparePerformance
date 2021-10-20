public class Compare {

    public static void main(String[] args) {
        final String strPlus = "string";
        String str = "";
        int count = 100000;
        long start, end;

        System.out.println("String+ на " + count + " повторений:");
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            str += strPlus;
        }
        end = System.nanoTime();
        System.out.println("Наносекунд: " + (end - start));
        System.out.printf("Милисекунд: %.2f\n", ((double) (end - start) / 1000000));
        System.out.printf("Секунд: %.2f\n", ((double) (end - start) / 1000000000 ));
        str = "";

        System.out.println("\nString.concat на " + count + " повторений:");
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            str = str.concat(strPlus);
        }
        end = System.nanoTime();
        System.out.println("Наносекунд: " + (end - start));
        System.out.printf("Милисекунд: %.2f\n", ((double) (end - start) / 1000000));
        System.out.printf("Секунд: %.2f\n", ((double) (end - start) / 1000000000 ));


        StringBuffer strBuffer = new StringBuffer();
        System.out.println("\nStringBuffer на " + count + " повторений:");
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            strBuffer.append(strPlus);
        }
        end = System.nanoTime();
        System.out.println("Наносекунд: " + (end - start));
        System.out.printf("Милисекунд: %.2f\n", ((double) (end - start) / 1000000));
        System.out.printf("Секунд: %.2f\n", ((double) (end - start) / 1000000000 ));


        StringBuilder strBuilder = new StringBuilder();
        System.out.println("\nStringBuilder на " + count + " повторений:");
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            strBuilder.append(strPlus);
        }
        end = System.nanoTime();
        System.out.println("Наносекунд: " + (end - start));
        System.out.printf("Милисекунд: %.2f\n", ((double) (end - start) / 1000000));
        System.out.printf("Секунд: %.2f\n", ((double) (end - start) / 1000000000 ));


    }


}
