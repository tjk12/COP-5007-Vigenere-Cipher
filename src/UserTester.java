public class UserTester {
    public static void main(String[] args) {

        /* Testing default constructor */
        User defaultUser = new User();
        defaultUser.setUsername("Emily");
        defaultUser.setKey("TREJK");
        defaultUser.setClearPassword("cantognate");
        System.out.println("Default User: " + defaultUser.toString());

        /* Testing parameterized constructor */
        User parameterizedUser = new User("Trever", "password", "house");
        System.out.println("Parameterized User: " + parameterizedUser.toString());

        /* Testing mutating parameterized constructor */
        parameterizedUser.setUsername("Emily");
        parameterizedUser.setKey("TREJK");
        parameterizedUser.setClearPassword("cantognate");
        System.out.println("Mutated Parameterized User: " + parameterizedUser.toString());
    }
}