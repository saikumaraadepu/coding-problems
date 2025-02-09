public class Driver {

    public static void main(String[] args) {

        Driver d = new Driver();

        Person p = d.getPerson();
        System.out.println(p.id + " " + p.name + " " + p.age);

        Person[] persons = d.getPersonsArray();

        d.printPerson2(persons);

        d.printPerson1(persons[0], persons[1]);
    }

    Person getPerson() {

        Person p = new Person();
        p.id = 525;
        p.name = "sai";
        p.age = 22;

        return p;
    }

    void printPerson1(Person p1, Person p2) {
        System.out.println(p1.id + " " + p1.name + " " + p1.age);
        System.out.println(p2.id + " " + p2.name + " " + p2.age);
    }

    void printPerson2(Person[] p) {

        for (Person person : p) {
            System.out.println(person.id + " " + person.name + " " + person.age);
        }
    }

    Person[] getPersonsArray() {

        Person p1 = new Person();
        p1.id = 101;
        p1.name = "sai";
        p1.age = 22;
        Person p2 = new Person();
        p2.id = 102;
        p2.name = "kumar";
        p2.age = 23;
        Person p3 = new Person();
        p3.id = 103;
        p3.name = "adepu";
        p3.age = 22;

        return new Person[] {p1, p2, p3};
    }
}
