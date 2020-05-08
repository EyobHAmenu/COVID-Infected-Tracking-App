import java.util.ArrayList;

public class Patient {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private ArrayList<Sysmptom> symptoms;
    private ArrayList<VisitedPlace> visitedPlaceList;
    private ArrayList<ContactedPerson> listOfContacts;



    public Patient(){
    }

    public Patient(String name, String email, String phoneNumber, String address,
                   String city, String state, ArrayList<Sysmptom> symptoms,
                   ArrayList<VisitedPlace> visitedPlaceList,
                   ArrayList<ContactedPerson> listOfContacts) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.symptoms = symptoms;
        this.visitedPlaceList = visitedPlaceList;
        this.listOfContacts = listOfContacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<Sysmptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Sysmptom> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<VisitedPlace> getVisitedPlaceList() {
        return visitedPlaceList;
    }

    public void setVisitedPlaceList(ArrayList<VisitedPlace> visitedPlaceList) {
        this.visitedPlaceList = visitedPlaceList;
    }

    public ArrayList<ContactedPerson> getListOfContacts() {
        return listOfContacts;
    }

    public void setListOfContacts(ArrayList<ContactedPerson> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

    public void displayPatient(){
        System.out.println("************ Infected patients Tracing Report. ************");
        System.out.println("***** Contact Tracing Report *****");
        System.out.println("NAME: " + getName() + "\n" + "PHONE: " + getPhoneNumber() + "\n" + "EMAIL: " + getEmail() + "\n"
                + "ADDRESS: " + getAddress() + "\t" + "CITY: " + getCity() + "\t" + "STATE: " + getState());
        System.out.println("**\tSymptoms: ");
        for(Sysmptom sysmptom: symptoms){
            sysmptom.displaySymptom();
        }
        System.out.println("**      Contacts:");
        for(ContactedPerson contactedPerson : listOfContacts){
            contactedPerson.displayContactedPersons();
        }
        System.out.println("**       Locations:");
        for(VisitedPlace visitedPlace : visitedPlaceList){
            visitedPlace.displayVisists();
        }
    }
}
