package Lab2.Q4;

public class PersonTest {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println(m.getFirstName()); // It should print “Ms.Alice”
        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println(f.getFirstName()); // it should print “Mr.Bob”
        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName()); // it should print “John”
        Child c = new Child(13, 130, 30);
        c.setFirstName("Sorn");
        System.out.println(c.getFirstName()); // it should print “Sorn”
    }
}
