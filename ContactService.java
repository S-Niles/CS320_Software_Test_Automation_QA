package ContactService;
import java.util.Hashtable;


public class ContactService {
    public Hashtable<String, Contact> contacts = new Hashtable<>();

    //Method for adding a Contact
    public void addContact(Contact contact) {
        //Checking that contact is not null and does not exist within the hash table.
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Invalid contact or contact ID already exists.");
        }
        //If not null and does not exist, add contact.
        contacts.put(contact.getContactId(), contact);
    }
    //Method for deleting a Contact
    public void deleteContact(String ContactId) {
        //Checking for ContactID is not null and exists within the table.
        if (ContactId == null || !contacts.containsKey(ContactId)) {
            throw new IllegalArgumentException("No Contact ID provided or does not exist.");
        }
        //If not null and does exist, delete contact.
        contacts.remove(ContactId);
    }
    //Private Method to find a contact to update information.
    private Contact findContactById(String contactId) {
        //Check to see if ContactID exists.
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist.");
        }
        //returns contactID if it exists.
        return contacts.get(contactId);
    }
    //Method for updating Contact First Name.
    public void updateContactFirstName(String contactId, String newFirstName) {
        Contact contact = findContactById(contactId);
        contact.setFirstName(newFirstName);
    }
    //Method for updating Contact Last Name.
    public void updateContactLastName(String contactId, String newLastName) {
        Contact contact = findContactById(contactId);
        contact.setLastName(newLastName);
    }
    //Method for updating Contact Phone Number
    public void updateContactPhoneNum(String contactId, String newPhoneNum) {
        Contact contact = findContactById(contactId);
        contact.setPhoneNum(newPhoneNum);
    }
    //Method for updating Contact Address.
    public void updateContactAddress(String contactId, String newAddress) {
        Contact contact = findContactById(contactId);
        contact.setAddress(newAddress);
    }

}
