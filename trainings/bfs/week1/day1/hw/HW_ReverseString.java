package trainings.bfs.week1.day1.hw;

public class HW_ReverseString {

    String ReverseString(String strIn) {

        String strOut = "";

        int len = strIn.length();
        for (int i = 0; i < len; i++) {
            strOut += strIn.charAt(len - i - 1);
        }

        return strOut;
    }

    String ReverseString2(String strIn) {

        String strOut = "";

        int len = strIn.length();
        for (int i = 0; i < len; i++) {
            strOut = strIn.charAt(i) + strOut;
        }

        return strOut;
    }

    public static void main(String[] args) {

        HW_ReverseString obj = new HW_ReverseString();
        String inputStr = "Nick (Wasin) Sanguansuk";
        System.out.println(obj.ReverseString(inputStr));
        System.out.println(obj.ReverseString2(inputStr));
    }
}

