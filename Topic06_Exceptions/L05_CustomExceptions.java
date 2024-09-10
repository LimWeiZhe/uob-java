package Topic06_Exceptions;

class IllegalUserNameException extends Exception{
    public IllegalUserNameException(String message){
        super(message);
    }
}

class IllegalEmailAddress extends RuntimeException{
    public IllegalEmailAddress(String message){
        super(message);
    }
}

class User{
    private String userName;
    private String email;

    //must define a default constructor if a clas has an overloaded constructor
    public User(){
    }

    public User(String userName, String email){
        this.userName = userName;
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }

    // when we use our custom exception, our method must indicate that we 
    public void setUserName(String userName) throws IllegalUserNameException{
        if (userName.length() < 6){
                throw new IllegalUserNameException("Username must be at least 6 characters long");
        }
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    // do not have to handle custom exceptions if it is a runtime exception
    public void setEmail(String email) {
        if (!email.contains("@")){
            throw new IllegalEmailAddress("Email must contain @");
        }
        this.email = email;
    }
}

public class L05_CustomExceptions {
    public static void main(String[] args) {
        // when you make a custom exception class that extends from Exception, you must handle it with try catch
        // this is called checked exception
        User u = new User();
        try{
            u.setUserName("Jon");
        } catch (IllegalUserNameException e){
            System.out.println(e.getMessage());
        }

        // no need to surround with try/catch because setEmail might throw a InvalidEmailAddressException
        // which extends RuntimeExeption, therefore it is an unchecked
        // although its best to use checked to be thorough, can check java hierachy tree 
        u.setEmail("ASDF");
    }
    
}
