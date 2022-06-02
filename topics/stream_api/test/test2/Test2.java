package topics.stream_api.test.test2;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("ad", "ba", "aa", "ac", null, "ab", "abc"));
        System.out.println(strList);

        List<String> resultList = strList.stream()
                //.filter((s) -> s != null)
                //.filter((s) -> Objects.nonNull(s))
                .filter(Objects::nonNull)
                .filter((s) -> s.startsWith("a"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(resultList);
    }

}
