public class UserTester {
    public static void main(String[] args) {
        User defaultUser = new User();
        System.out.println("Default User: " + defaultUser);

        User parameterizedUser = new User("Trever", "password", "house");
        
        System.out.println("Parameterized User: " + parameterizedUser.getEncryptedPassword());

    }
}