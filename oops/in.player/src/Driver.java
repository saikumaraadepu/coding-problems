public class Driver {

    public static void main(String[] args) {
        Driver d = new Driver();

        Player p = new Player();
        p.id = 45;
        p.name = "Rohit";
        p.age = 35;

        d.print(p);
    }

    void print(Player p) {
        System.out.println(p.id + " " + p.name + " " + p.age);
    }
}
