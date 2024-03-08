package btap5;

public class Main {
    public static void main(String[] args) {
        User user1 = new Admin("tra", "Huongtra19@gmail.com", "admin123");
        user1.register();
        user1.login("tra", "admin123");
        user1.logout();

        User user2 = new Customer("thuy", "thuy123@gmail.com", "thuy123");
        user2.register();
        user2.login("thuy", "thuy123");
        user2.logout();

        User user3 = new Moderator("tramy", "tramy456@gmail.com", "tramy@123");
        user3.register();
        user3.login("tramy", "tramy@123");
        user3.logout();
    }
}
