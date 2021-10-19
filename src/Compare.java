import java.time.LocalTime;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Compare {

    public static void main(String[] args) {
        Map <String, Long> resultMillisecond = new LinkedHashMap<>();
        Map <String, Long> resultNanosecond = new LinkedHashMap<>();
        String str =  "159263";
        int repetition = 20;
        Nanosecond nano = new Nanosecond();
        Millisecond msec = new Millisecond();

        resultNanosecond.put("Strinr+", nano.stringPlusNanosecond(str, repetition));
        resultNanosecond.put("Strinr.concat()", nano.stringConcatNanosecond(str, repetition));
        resultNanosecond.put("StringBuffer", nano.stringBufferNanosecond(str, repetition));
        resultNanosecond.put("StringBuilder", nano.stringBuilderNanosecond(str, repetition));


        resultMillisecond.put("Strinr+", msec.stringPlusNanosecond(str, repetition));
        resultMillisecond.put("Strinr.concat()", msec.stringConcatNanosecond(str, repetition));
        resultMillisecond.put("StringBuffer", msec.stringBufferNanosecond(str, repetition));
        resultMillisecond.put("StringBuilder", msec.stringBuilderNanosecond(str, repetition));

        System.out.println("Nanosecond");
        for (Map.Entry <String, Long> item : resultNanosecond.entrySet()){
            System.out.printf("%-20s %d \n", item.getKey(), item.getValue());

        }

        System.out.println("\nMillisecond");
        for (Map.Entry <String, Long> item : resultMillisecond.entrySet()){
            System.out.printf("%-20s %d \n", item.getKey(), item.getValue());

        }




    }



}
