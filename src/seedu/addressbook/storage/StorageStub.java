package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Emulate Storage for address book data.
 */
public class StorageStub implements Storage {

    private AddressBook addressBook;
    
    public StorageStub() {
        addressBook = new AddressBook();
    }

    /**
     * Does not store a deep copy.
     */
    @Override
    public void save(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public AddressBook load() {
        return addressBook;
    }

    @Override
    public String getPath() {
        return null;
    }

}
