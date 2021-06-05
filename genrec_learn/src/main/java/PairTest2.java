import java.time.LocalDate;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate localDatepp[]={
                LocalDate.of(1994, 1, 1),
                LocalDate.of(3004, 2, 2),
                LocalDate.of(2003, 2, 2)
        };
        Pair<LocalDate> minmax = ArrayAlg.minmax(localDatepp);
        System.out.println(minmax);
    }
}
class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        T min =a[0];
        T max=a[0];
        for (int i=0;i<a.length;i++){
            if(min.compareTo(a[i])>0) min=a[i];
            if(max.compareTo(a[i])<0) max=a[i];
        }
        return new Pair<>(min,max);
    }
}