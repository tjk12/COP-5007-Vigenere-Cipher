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

    }

    public String getClearPassword(){
        
    }

    public String getEncryptedPassword(){
        
    }

    public String getKey(){
        
    }

    public String setUsername(){

    }

    public String setClearPassword(){
        
    }

    public String setEncryptedPassword(){
        
    }

    public String setKey(){
        
    }

    private String encrypt(String clearPassword, String key){
        int i;
        String encryptedPassword;
        encryptedPassword = "";

        for(i=0; i<clearPassword.length(); i++){
            int x = (clearPassword.charAt(i) + key.charAt(i)) % 26;
            x += 'A';
            encryptedPassword += (char)(x);
        }
        
        return encryptedPassword;
    }

    private String toString(){
        
    }
}