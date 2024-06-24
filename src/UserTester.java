public class UserTester {
    public static void main(String[] args) {
        UserTester();
    }
    public static String UserTester(){
        int i;
        String clearPassword = "TREVERJK";
        String key = "EMILY";

        String encryptedPassword = "";
    
            for(i=0; i<clearPassword.length(); i++){
                int x = (clearPassword.charAt(i) + key.charAt(i)) % 26;
                x += 'A';
                encryptedPassword += (char)(x);
            }
            
            return encryptedPassword;
        }

    }
