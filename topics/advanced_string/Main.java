package topics.advanced_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("---> StringBuffer");

        StringBuffer str = new StringBuffer("PerScholas");
        System.out.println(str);
        int len = str.length();
        int capt = str.capacity();
        System.out.println("Length = " + len);
        System.out.println("Capacity = " + capt);

        str.append(" Platform");
        System.out.println(str);
        str.append(1);
        System.out.println(str);        // PerScholas Platform1     (index 11 is P)
        str.insert(11, "for");
        System.out.println(str);        // PerScholas forPlatform1
        str.insert(0, 5);
        System.out.println(str);        // 5PerScholas forPlatform1
        str.insert(4, true);
        System.out.println(str);        // 5PertrueScholas forPlatform1
        char[] charArr = { 'b', 'y' };
        str.insert(1, charArr);
        System.out.println(str);        // 5byPertrueScholas forPlatform1
        str.delete(str.indexOf("P"), str.indexOf("P")+7);
        System.out.println(str);        // 5byScholas forPlatform1

        System.out.println("indexOf(\"Plat\"): " + str.indexOf("Plat"));

        str.reverse();
        System.out.println(str);        // 1mroftalProf salohcSyb5

        System.out.println("indexOf(\"Plat\"): " + str.indexOf("Plat"));

        System.out.println("----------");
        System.out.println("---> StringJoiner");
        // delimiter:   ","
        // prefix:      "["
        // suffix:      "]"

        StringJoiner joinNames = new StringJoiner(",", "[", "]");
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Haseeb");
        System.out.println(joinNames);

        StringJoiner joinNames2 = new StringJoiner(":", "{", "}");
        joinNames2.add("Peter");
        joinNames2.add("David");
        joinNames2.add("Brian");
        System.out.println(joinNames2);

        // Merging two StringJoiner
        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println("merge: \t\t\t" + merge);
        System.out.println("joinNames: \t\t" + joinNames);
        System.out.println("joinNames2: \t" + joinNames2);

        System.out.println("----------");

        StringJoiner strJoiner = new StringJoiner(", ");
        strJoiner.add("Bat");
        strJoiner.add("Cat");
        strJoiner.add("Rat");
        strJoiner.add("Bin");
        strJoiner.add("Pin");
        strJoiner.add("Pig");
        strJoiner.add("Wig");
        System.out.println(strJoiner);

        System.out.println("----------");
        System.out.println("StringJoiner with List");

        List<String> list2 = new ArrayList<>(Arrays.asList("London", "Paris", "NewYork", "Chicago"));
        System.out.println(list2);

        String str2 = String.join("|", list2);
        System.out.println(str2);

        System.out.println("----------");

    }
}
