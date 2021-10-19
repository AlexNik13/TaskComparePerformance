public class Millisecond {

    private long startTime;
    private long endTime;
    private long sum;

    //+
    public long stringPlusNanosecond(String plus, int repetition) {
        System.gc();
        sum = 0;
        String str = "";
        startTime = System.currentTimeMillis();
        for (int r = 0; r < repetition; r++) {
            str += plus;
        }
        endTime = System.currentTimeMillis();
        sum += endTime - startTime;
        return sum;
    }

    //.concat()
    public long stringConcatNanosecond(String plus, int repetition) {
        System.gc();
        sum = 0;
        String str = "";
        startTime = System.currentTimeMillis();
        for (int r = 0; r < repetition; r++) {
            str += str.concat(plus) ;
        }
        endTime = System.currentTimeMillis();
        sum += endTime - startTime;
        return sum;
    }

    // StringBuffer
    public long stringBufferNanosecond(String plus, int repetition){
        System.gc();
        sum = 0;
        StringBuffer str = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int r = 0; r < repetition; r++) {
            str.append(plus) ;
        }
        endTime = System.currentTimeMillis();
        sum += endTime - startTime;
        return sum;
    }

    //StringBuilder
    public long stringBuilderNanosecond(String plus, int repetition){
        System.gc();
        sum = 0;
        StringBuilder str = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int r = 0; r < repetition; r++) {
            str.append(plus) ;
        }
        endTime = System.currentTimeMillis();
        sum += endTime - startTime;
        return sum;
    }

}