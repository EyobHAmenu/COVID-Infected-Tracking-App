public class Patient {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private Sysmptom symptom;

    public Patient(){
    }

    public Patient(String name, String email, String phoneNumber, String address, String city, String state, Sysmptom symptom) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.symptom = symptom;
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

    public Sysmptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Sysmptom symptom) {
        this.symptom = symptom;
    }

    public String displayPatient(){
        String information;
        information = "NAME: " + getName() + "\n" + "PHONE: " + getPhoneNumber() + "\n" + "EMAIL: " + getEmail() + "\n"
                + "ADDRESS: " + getAddress() + "\t" + "CITY: " + getCity() + "\t" + "STATE: " + getState() +
                "\n------------ List of Symptoms " + getName() + " -------------------\n"
                + getSymptom().displaySymptoms();
        return information;
    }
}
