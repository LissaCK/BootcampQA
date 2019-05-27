package testData;

public class UserWalker {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String apt;
    private String zipcode;

    public UserWalker() {
        firstName = "Ivan";
        lastName = "Petrov";
        email = "123@.sd";
        phone = "12311111";
        address = "123";
        apt = "123";

    }

    public String getFirstName(){
        return firstName;
    }

    public  String getLastName(){
        return  lastName;
    }

    public String getEmail(){
        return email;
    }

    public String  getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

    public String getApt(){
        return apt;
    }

    public String getZipcode(){
        return zipcode;
    }
    public String getCity(){
        return city;
    }


}
