public class Driver {

    public static void main(String[] args) {
        Driver d = new Driver();

        Player p = d.getPlayer(18);
        System.out.println(p.id + " -- " + p.name + " -- " + p.age);
    }

    Player getPlayer(int id) {
        Player player = new Player();
        switch (id) {
            case 7:
                player.id = 7;
                player.name = "MS Dhoni";
                player.age = 42;
                break;
            case 18:
                player.id = 18;
                player.name = "Virat Kohli";
                player.age = 35;
                break;
            case 45:
                player.id = 45;
                player.name = "Rohit Sharma";
                player.age = 36;
                break;
            case 10:
                player.id = 10;
                player.name = "Virender Sehwag";
                player.age = 45;
                break;
            case 12:
                player.id = 12;
                player.name = "Yuvraj Singh";
                player.age = 42;
                break;
            case 37:
                player.id = 37;
                player.name = "Anil Kumble";
                player.age = 54;
                break;
            default:
                System.out.println("Player not found for jersey number: " + id);
                break;
        }
        return player;

    }
}
