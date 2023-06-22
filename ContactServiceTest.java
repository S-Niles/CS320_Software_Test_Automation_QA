package ContactService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class ContactServiceTest {
        private ContactService contactService;

        @BeforeEach
        void setUp() {
            contactService = new ContactService();
        }

        @Test
        void addContactIdDuplicateTest() {
            // Creating a valid Contact with unique ID.
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);

            // Duplicate Contact ID
            Contact contact2 = new Contact("123456789", "Sam", "Sparks",
                                           "7025554321", "12 Swallow Falls Drive");

            assertThrows(IllegalArgumentException.class, () -> {
                contactService.addContact(contact2);
            });
        }
        @Test
        void addContactNullTest() {
            assertThrows(IllegalArgumentException.class, () -> {
                contactService.addContact(null);
            });
        }
        @Test
        void updateFirstNameInvalidTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactFirstName("123456789", "Officer Earl"));
        }

        @Test
        void updateFirstNameNullTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactFirstName("123456789", null));
        }
        @Test
        void updateLastNameInvalidTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactLastName("123456789",
                                                         "Wolfeschlegelsteinhausenbergerdorff Sr."));
        }

        @Test
        void updateLastNameNullTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactLastName("123456789", null));
        }

        @Test
        void updatePhoneNumInvalidTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactPhoneNum("123456789", "12345678987654321"));
        }

        @Test
        void updatePhoneNumNullTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactPhoneNum("123456789", null));
        }

        @Test
        void updateAddressInvalidTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactAddress("123456789",
                                                      "54 Jean Baptiste Point du Sable Lake Shore Drive"));
        }

        @Test
        void updateAddressNullTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "13 Swallow Falls Drive");

            contactService.addContact(contact);
            assertThrows(IllegalArgumentException.class, () ->
                    contactService.updateContactAddress("123456789", null));
        }

        @Test
        void deleteContactInvalidTest() {
            assertThrows(IllegalArgumentException.class, () -> contactService.deleteContact("NonExistentID"));
        }

        @Test
        void deleteContactNullTest() {
            assertThrows(IllegalArgumentException.class, () -> contactService.deleteContact(null));
        }

        @Test
        void deleteContactValidTest() {
            Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                          "7025551234", "Address");

            contactService.addContact(contact);
            assertDoesNotThrow(() -> contactService.deleteContact("123456789"));
        }
}