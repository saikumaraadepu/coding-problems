public class Driver {

    public static void main(String[] args) {

        Driver d = new Driver();

        Person p = d.getPerson();
        System.out.println(p.id + " " + p.name + " " + p.age);
    }

    Person getPerson() {

        Person p = new Person();
        p.id = 525;
        p.name = "sai";
        p.age = 22;

        return p;
    }
}
