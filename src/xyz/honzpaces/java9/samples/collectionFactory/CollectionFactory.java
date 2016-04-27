package xyz.honzpaces.java9.samples.collectionFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

/**
 * 
 */
public class CollectionFactory {

    public static void main(String[] args) {

        List<Long> list = List.of(1L,2l,3L,4L);
        System.out.println(list.getClass());
        list.forEach(System.out::println);
        
        
        Set<String> set = Set.of("1","2");
        System.out.println(set.getClass());
        set.forEach(System.out::println);
        
        Map<String,Integer> map = Map.of("1",2,"2",2);
        System.out.println(map.getClass());
        map.forEach((k,v) -> System.out.println("Key:" + k + " Value: "+v));
        
        Map<String,Integer> mapMultipleEntries = Map.ofEntries(
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1),
                entry("1",1)
        );
        
        
    }
}
