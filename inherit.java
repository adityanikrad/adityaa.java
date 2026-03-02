class Person {
    protected String name;   // accessible in subclasses
    protected int phone;

    public Person() {
        System.out.println("default constructor person");
        name = "xxx";
        phone = 0;
    }

    public Person(String name, int phone) {
        System.out.println("parameterised constructor person");
        this.name = name;
        this.phone = phone;
    }

    public void display() {
        System.out.println("name : " + name + "\nphone : " + phone);
    }
}

class Student extends Person {
    private String school;
    private int std;
    private float m1, m2;

    public Student() {
        super(); // calls Person default constructor
        System.out.println("default constructor student");
        school = "xxx";
        std = 1;
        m1 = 0;
        m2 = 0;
    }

    public Student(String name, int phone, String school, int std, float m1, float m2) {
        super(name, phone); // calls Person parameterized constructor
        System.out.println("parameterised constructor student");
        this.school = school;
        this.std = std;
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public void display() {
        super.display(); // reuse Person’s display
        System.out.println("school : " + school + "\nstd : " + std + "\nm1 : " + m1 + "\nm2 : " + m2);
    }
}

public class inherit {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();

        Person p2 = new Person("Omkar", 12345);
        p2.display();

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Omkar", 12345, "ABC School", 10, 85.5f, 90.0f);
        s2.display();
    }
}