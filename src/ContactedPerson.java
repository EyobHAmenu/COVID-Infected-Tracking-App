import java.util.ArrayList;
import java.util.HashMap;

public class ContactedPerson extends Patient{
    private String locationOfContact;
    private String dateOfContact;

    public ContactedPerson() {
    }

    public ContactedPerson(String locationOfContact, String dateOfContact) {
        this.locationOfContact = locationOfContact;
        this.dateOfContact = dateOfContact;
    }

    public String getLocationOfContact() {
        return locationOfContact;
    }

    public void setLocationOfContact(String locationOfContact) {
        this.locationOfContact = locationOfContact;
    }

    public String getDateOfContact() {
        return dateOfContact;
    }

    public void setDateOfContact(String dateOfContact) {
        this.dateOfContact = dateOfContact;
    }
    public void displayContactedPersons(){

        System.out.println("Name :"  + getName() + "\n" + "Phone: " + getPhoneNumber() + "\n" + "Email: " +
                getEmail() + "\n" + "ADDRESS: " + getAddress() + "\t" + "CITY: " + getCity() + "\t" + "STATE: "
                + getState() + "\n" + "CONTACTED LOCATION: " + getLocationOfContact() + "\n" + "DATE OF CONTACT: "
                + getDateOfContact() + "\n");
    }
}
