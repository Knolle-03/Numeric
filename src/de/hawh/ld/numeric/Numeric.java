package de.hawh.ld.numeric;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Numeric {

    public static void main(String[] args) {
        List<Integer> coll1 = List.of(111223422,322222222,234234234,222324234,999999123,546456,8567);
        List<Integer> coll2 = List.of(1,2,3,4,5,6,7,8);
        List<Integer> coll3 = List.of(11341,22223422,32222,234234,22234,99123,5456,867);
        List<Integer> coll4 = List.of(1112342341,22223422,322222222,234234234,222324234,999999123,546456,8567);

        System.out.println(Numeric.sum(coll1));
        System.out.println(Numeric.sum(coll2));
        System.out.println(Numeric.sum(coll3));
        System.out.println(Numeric.sum(coll4));
    }


    public static int sum(Collection<Integer> coll) {
        Iterator iterator = coll.iterator();
        int j = 0;
        for(int i = 0; i < coll.size() ; i++) {
            j = Math.addExact(j, Integer.parseInt(iterator.next().toString()));
        }
        return j;
    }
}
