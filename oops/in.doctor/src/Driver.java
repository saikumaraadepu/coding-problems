public class Driver {

    public static void main(String[] args) {
        Driver d = new Driver();

        Doctor dc = new Doctor();
        dc.name = "Hitler";
        dc.age = 45;

        d.print(dc);
    }

    void print(Doctor dc) {
        System.out.println(dc.name + " " + dc.age);
    }
}
