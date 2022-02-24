package trainings.bfs.week1.day3.demo.deepcopy;

public class CloneExample implements Cloneable {
    private String name;
    private int age;
    private HomeAddress homeAddress;

    public CloneExample(String name, int age, HomeAddress homeAddress) {
        this.name = name;
        this.age = age;
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "CloneExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeAddress=" + homeAddress +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        CloneExample std = new CloneExample("Nick", 34, new HomeAddress("1165 N Milwaukee Ave", "IL"));
        CloneExample copiedStd = (CloneExample) std.clone();
        System.out.println("Contents of the original object");
        System.out.println(std);
        System.out.println("Contents of the copied object");
        System.out.println(copiedStd);

        System.out.println("---");

        copiedStd.setName("Pete");
        copiedStd.setAge(33);
        copiedStd.setHomeAddress(new HomeAddress("7333 N Ridge St", "IL"));
        System.out.println("Contents of the original object");
        System.out.println(std);
        System.out.println("Contents of the copied object");
        System.out.println(copiedStd);
    }
}

class HomeAddress implements Cloneable {
    String street;
    String state;

    public HomeAddress(String street, String state) {
        this.state = state;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "street='" + street + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}