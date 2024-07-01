import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {
    private Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
    }

    @Test
    void testContactId() {
        assertEquals("1234567890", contact.getContactId());
    }

    @Test
    void testFirstName() {
        assertEquals("John", contact.getFirstName());
        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());
    }

    @Test
    void testLastName() {
        assertEquals("Doe", contact.getLastName());
        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());
    }

    @Test
    void testPhone() {
        assertEquals("1234567890", contact.getPhone());
        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    @Test
    void testAddress() {
        assertEquals("123 Main St", contact.getAddress());
        contact.setAddress("456 Elm St");
        assertEquals("456 Elm St", contact.getAddress());
    }
}
