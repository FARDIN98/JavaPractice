package OOP.lab.getter_and_setter;

public class EncapTest {
    public static void main(String[] args) {
        person pr = new person();
        pr.setName("Fardin");
        pr.setAge(21);
        System.out.println(pr.getName());
        System.out.println(pr.getAge());
    }
}
