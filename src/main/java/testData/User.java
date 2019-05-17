package testData;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String incorectEmail;

    public User(){
        firstName = "Ivan";
        lastName = "Petrov";
        email = "my@gmail.com";
        password = "123";
        phoneNumber = "(123) 333-444";
        incorectEmail = "12345";
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getIncorectEmail(){
        return incorectEmail;
    }

}
