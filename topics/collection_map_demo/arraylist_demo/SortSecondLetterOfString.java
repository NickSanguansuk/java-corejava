package topics.collection_map_demo.arraylist_demo;

import java.util.Comparator;

public class SortSecondLetterOfString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String str1 = o1.substring(1);
        String str2 = o2.substring(1);
        return str1.compareTo(str2);
    }
}
