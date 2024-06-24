public class User {
    private String username;
    private String clearPassword;
    private String encryptedPassword;
    private String key;

    public User(){
        this.username = "";
        this.clearPassword = "";
        this.encryptedPassword = "";
        this.key = "";
    
    }
    public User(String username, String clearPassword, String key){
        this.username = username;
        this.clearPassword = clearPassword;
        this.key = key;

        this.encryptedPassword = encrypt(clearPassword, key);
    }

    public String getUsername(){
        return username;
    }

    public String getClearPassword(){
        return clearPassword;
    }

    public String getEncryptedPassword(){
        return encryptedPassword;
    }

    public String getKey(){
        return key;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setClearPassword(String clearPassword){
        this.clearPassword = clearPassword;
    }

    public void setEncryptedPassword(String encryptedPassword){
        this.encryptedPassword = encryptedPassword;
    }

    public void setKey(String key){
        this.key = key;
    }

    private String encrypt(String clearPassword, String key) {
        StringBuilder encrypted = new StringBuilder();
        int keyLength = key.length();
        int asciiStart = 33;
        int asciiEnd = 122;
        int range = asciiEnd - asciiStart + 1;

        for (int i = 0; i < clearPassword.length(); i++) {
            char clearChar = clearPassword.charAt(i);
            char keyChar = key.charAt(i % keyLength);
            int clearIndex = clearChar - asciiStart;
            int keyIndex = keyChar - asciiStart;
            char encryptedChar = (char) (asciiStart + (clearIndex + keyIndex) % range);
            encrypted.append(encryptedChar);
        }

        return encrypted.toString();
    }

    public String toString() {
        return username + "\t" + encryptedPassword + "\t" + clearPassword + "\t" + key;
    }
}