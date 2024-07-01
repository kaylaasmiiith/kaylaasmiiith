Contact Class
The Contact class represents a contact with attributes such as contact ID, first name, last name, phone number, and address. It includes methods for validation and updating these attributes.

Attributes:
contactId: Unique identifier for each contact (String, up to 10 characters).
firstName: First name of the contact (String, up to 10 characters).
lastName: Last name of the contact (String, up to 10 characters).
phone: Phone number of the contact (String, exactly 10 digits).
address: Address of the contact (String, up to 30 characters).
Methods:
Constructor: Initializes a contact with provided attributes, validates input.
getters and setters: Access and modify contact attributes, with validation for length and format.
ContactService Class
The ContactService class manages a collection of contacts using a HashMap. It provides methods to add, delete, update, and retrieve contacts.

Methods:
addContact(Contact contact): Adds a new contact to the service.
deleteContact(String contactId): Deletes a contact by contact ID.
updateContact(String contactId, String firstName, String lastName, String phone, String address): Updates specified fields of a contact.
getContact(String contactId): Retrieves a contact by contact ID.
ContactTest Class
The ContactTest class contains unit tests for the Contact class using JUnit.

Tests:
testContactId: Verifies correct initialization and retrieval of contact ID.
testFirstName: Tests setting and getting of first name, including validation.
testLastName: Tests setting and getting of last name, including validation.
testPhone: Tests setting and getting of phone number, including validation.
testAddress: Tests setting and getting of address, including validation.
ContactServiceTest Class
The ContactServiceTest class contains unit tests for the ContactService class using JUnit.

Tests:
testAddContact: Verifies adding a contact to the service and retrieving it.
testDeleteContact: Tests deleting a contact from the service.
testUpdateContact: Tests updating various fields of a contact and retrieving the updated information.
