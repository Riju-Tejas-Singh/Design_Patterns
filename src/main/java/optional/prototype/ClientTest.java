package optional.prototype;

public class ClientTest {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Raj");

        Student s2 = s1.clone();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);
        s1.setId(2);
        s1.setName("Taj");
        System.out.println(s1);
        System.out.println(s2);
    }

}
