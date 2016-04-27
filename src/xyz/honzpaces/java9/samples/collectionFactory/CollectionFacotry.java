package xyz.honzpaces.java9.samples.collectionFactory;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Map.of;

/**
 * Created by janpa on 25.04.2016.
 */
public class CollectionFacotry {

    public static void main(String[] args) {
        Set<String> set = Set.of("1","2");
        Map<String,Integer> map = Map.of("1",2,"2",2);
        System.out.println(set.getClass());
    }
}
