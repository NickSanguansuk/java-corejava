package temp;

import java.util.ArrayList;
import java.util.List;

public class Question13 {

    //public List<String> solve(List<String> list) {
    //    List<String> result = new ArrayList<>();
    //
    //    for (String str : list) {
    //        char prev = Character.UNASSIGNED;
    //        StringBuilder sb = new StringBuilder();
    //        for (char c : str.toCharArray()) {
    //            if (c == prev) {
    //                continue;
    //            } else {
    //                sb.append(c);
    //                prev = c;
    //            }
    //        }
    //        result.add(sb.toString());
    //    }
    //    return result;
    //}

    public List<String> solve(List<String> list) {
        List<String> result = new ArrayList<>(); // result

        for (String str : list) {
            char prev = Character.UNASSIGNED;
            String tmp = ""; // sub-result
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == prev) {
                    continue;
                } else {
                    tmp += c;
                    prev = c;
                }
            }
            result.add(tmp);
        }
        return result;
    }

    public static void main(String[] args) {
        Question13 obj = new Question13();

        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("across");
        list.add("beeeater");
        list.add("Bookkeeper");

        System.out.println(obj.solve(list));

    }
}
