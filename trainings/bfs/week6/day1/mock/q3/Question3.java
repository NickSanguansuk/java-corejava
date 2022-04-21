package trainings.bfs.week6.day1.mock.q3;

public class Question3 {

    // A = 65, Z = 90
    // a = 97, z = 122
    public String q3(String str, int rotationFactor){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //System.out.println(c);
            if ((c >= 65 && c <= 90)  ) {
                for (int j = 0; j < rotationFactor; j++) {
                    c++;
                    if (c == 91) {
                        c = 65;
                    }
                }
                result += c;
            } else if ((c >= 97 && c <= 122)) {
                for (int j = 0; j < rotationFactor; j++) {
                    c++;
                    if (c == 123) {
                        c = 97;
                    }
                }
                result += c;
            } else if ((c >= 48 && c <= 57)) {
                for (int j = 0; j < rotationFactor; j++) {
                    c++;
                    if (c == 58) {
                        c = 48;
                    }
                }
                result += c;
            } else {
                result += c;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Question3 question3 = new Question3();

        String str1 = "A-b!c";
        int rotationFactor1 = 2;
        System.out.println(question3.q3(str1, rotationFactor1));

        String str2 = "39ZA";
        int rotationFactor2 = 4;
        System.out.println(question3.q3(str2, rotationFactor2));

    }
}
