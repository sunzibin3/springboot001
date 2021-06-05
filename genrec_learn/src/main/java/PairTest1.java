public class PairTest1 {
    public static void main(String[] args) {
        String [] words ={"sun","sun12","sun123"};
//        ArrayAlg arrayAlg = new ArrayAlg();
        Pair<String> pair = ArrayAlg.minmax(words);
        System.out.println(pair.getFirst()+"\n"+pair.getSecond());
    }

    static class ArrayAlg{
        public static Pair<String> minmax(String a[]){
            String min;
            String max;
            min=a[0];
            max=a[0];
            for (int i=0;i<a.length;i++){
                if (min.compareTo(a[i])>0){
                    min=a[i];
                }
                if (max.compareTo(a[i])<0){
                    max=a[i];
                }
            }
            return new Pair<>(min,max);
        }
    }
}
