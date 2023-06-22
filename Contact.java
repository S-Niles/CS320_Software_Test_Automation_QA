package ContactService;

public class Contact {
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String address;

    //Constructor method to create new contact and validates user inputs per requirements.
    public Contact(String contactId, String firstName, String lastName, String phoneNum, String address) {
        //Validation Input for Contact ID, must be less than 10 characters and not null.
        //ContactId validation kept within constructor due to "final" declaration.
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid Contact ID");
        }
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNum(phoneNum);
        setAddress(address);
    }
    //Setter methods with input validation.
    public void setFirstName(String firstName) {
        //Validation Input for First Name, must be less than 10 characters and not null.
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        //Validation Input for Last Name, must be less than 10 characters and not null.
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        this.lastName = lastName;
    }
    public void setPhoneNum(String phoneNum) {
        //Validation Input for Phone Number, must be exactly 10 characters and not null.
        if (phoneNum == null || phoneNum.length() != 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        this.phoneNum = phoneNum;
    }
    void setAddress(String address) {
        //Validation Input for Address, must be less than 30 characters and not null.
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid Address");
        }
        this.address = address;
    }
    //Getter methods.
    public String getContactId() {return contactId;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getPhoneNum() {return phoneNum;}
    public String getAddress() {return address;}
}
