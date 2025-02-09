public class Driver {

    public static void main(String[] args) {

        Driver d = new Driver();

        College c = d.getCollege();
        System.out.println(c.id + " " + c.name);
    }

    College getCollege() {

        College c = new College();
        c.id = 6;
        c.name = "VITS";

        return c;
    }
}
