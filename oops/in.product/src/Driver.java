public class Driver {

    public static void main(String[] args) {

        Driver d = new Driver();

        Product p = new Product();
        p.pid = 101;
        p.name = "CPU";
        p.price = 1000.00;

        d.print(p);
    }

    void print(Product p) {
        System.out.println(p.pid + " " + p.name + " " + p.price);
    }
}
