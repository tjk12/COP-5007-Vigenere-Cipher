public class User {
    private String username;
    private String clearPassword;
    private String encryptedPassword;
    private String key;

    /* Default constructor:
        - sets all fields to the empty String (“”) 
    */
    public User(){
        setUsername("");
        setKey("");
        setClearPassword("");
    
    }
    /* Parameterized constructors: 
        - takes in the username, clearPassword and the key
        - calls the private method encrypt to encrypt the clearPassword using the Vigenere Cypher
    */
    public User(String username, String clearPassword, String key){
        setUsername(username);
        setKey(key);
        setClearPassword(clearPassword);


        this.encryptedPassword = encrypt(clearPassword, key);
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getClearPassword(){
        return clearPassword;
    }

    public void setClearPassword(String clearPassword){
        this.clearPassword = clearPassword;
        this.encryptedPassword = encrypt(clearPassword, getKey());
    }

    public String getEncryptedPassword(){
        return encryptedPassword;
    }

    public String getKey(){
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }

    private String encrypt(String clearPassword, String key) {
        String encryptedPassword = "";
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
            encryptedPassword += encryptedChar;
        }

        return encryptedPassword;
    }

    public String toString() {
        return getUsername() + "\t" + getEncryptedPassword() + "\t" + getClearPassword() + "\t" + getKey();
    }
}