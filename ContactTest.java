package ContactService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testContactValid() {
        Contact contact = new Contact("123456789", "Flint", "Lockwood",
                                     "7025551234", "13 Swallow Falls Drive");

        assertEquals("123456789", contact.getContactId());
        assertEquals("Flint", contact.getFirstName());
        assertEquals("Lockwood", contact.getLastName());
        assertEquals("7025551234", contact.getPhoneNum());
        assertEquals("13 Swallow Falls Drive", contact.getAddress());
    }
    @Test
    void testContactInvalidId() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678987654321","Flint","Lockwood",
                       "7025551234", "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactNullId() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null,"Flint","Lockwood",
                    "7025551234", "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactInvalidFirstName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789","Officer Earl","Devereaux",
                    "7025551234", "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactNullFirstName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789",null,"Devereaux",
                    "7025551234", "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactInvalidLastName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789","Hubert","Wolfeschlegelsteinhausenbergerdorff Sr.",
                    "7025551234", "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactNullLastName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789","Hubert",null,
                    "7025551234", "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactInvalidPhoneNum() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789","Flint","Lockwood",
                    "5551234", "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactNullPhoneNum() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789","Flint","Lockwood",
                    null, "13 Swallow Falls Drive" );
        });
    }
    @Test
    void testContactInvalidAddress() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789","Flint","Lockwood",
                    "7025551234", "54 Jean Baptiste Point du Sable Lake Shore Drive" );
        });
    }
    @Test
    void testContactNullAddress() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123456789","Flint","Lockwood",
                    "7025551234", null );
        });
    }
}