public class Main {
    public static void main(String[] args) {
        GroceryList groceryListManager = new GroceryList();
        groceryListManager.runMenu();

        System.out.println("*****************");

        MobilePhone myMobilePhone = new MobilePhone("1234567890");

        Contact bob = new Contact("Bob", "31415926");
        Contact alice = new Contact("Alice", "16180339");
        Contact tom = new Contact("Tom", "11235813");
        Contact jane = new Contact("Jane", "23571113");

        myMobilePhone.addNewContact(bob);
        myMobilePhone.addNewContact(alice);
        myMobilePhone.addNewContact(tom);
        myMobilePhone.addNewContact(jane);

        myMobilePhone.printContacts();

        Contact newBob = new Contact("Bob", "98765432");
        myMobilePhone.updateContact(bob, newBob);

        myMobilePhone.printContacts();

        myMobilePhone.removeContact(alice);

        myMobilePhone.printContacts();

        String searchName = "Tom";
        Contact foundContact = myMobilePhone.queryContact(searchName);
        if (foundContact != null) {
            System.out.println("Found contact: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }

}