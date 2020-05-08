import java.util.ArrayList;
import java.util.Scanner;

public class TracingApp {
    public static void main(String[] args) {
        /*
            * Patient class: patient has a symptom so i creat symptom instance
                Variables: name, email, phoneNumber, address, city, state, symptom
            * ContactedPerson class: this class extends patient class so can have instance of patient class
                Variables: locationOfContact and dateOfContact
            * Symptom class:
                Variables: symptom, number-of-days and hashmap that store the two variables
            * Visit class:
                Variables: name, address,city, state, date
            * Main class:
                Arraylist for contacted persons and for visited places


         */

        /* Sample output:
            ************ Infected patients Tracing Report. ************
            NAME: Eyob Amenu
            PHONE: 222-222-2222
            EMAIL: eyob@eyob
            ADDRESS: 12 park st	CITY: Silver Spring	STATE: MD
            ------------ List of Symptoms Eyob Amenu -------------------
            had Chills for 1 days.
            had Headache for 1 days.
            had Sore throat for 1 days.
            had Loss of taste for 1 days.
            had Aches for 1 days.
            had Tiredness for 1 days.
            had Diarrhea for 1 days.
            had Loss of smell for 1 days.
            had Fever for 1 days.
            had Cough for 1 days.
            had Shortness of breath or difficulty breathing for 1 days.

            -------- Peoples in contact with Eyob Amenu
            Name :Henok Amenu
            Phone: 111-111-1111
            Email: henok@1
            ADDRESS: 1 circle Ave	CITY: Silver	STATE: MD
            CONTACTED LOCATION: 22 Ave
            DATE OF CONTACT: 11/23/2020

            Name :Minia
            Phone: 444-444-4444
            Email: minia@2
            ADDRESS: 1 east st	CITY: Silver	STATE: DC
            CONTACTED LOCATION: 14 st NW
            DATE OF CONTACT: 5/23/2020

            -------- Place's where Eyob Amenu visited in the past 14 days.
            Name: Addis Ababa, Address: Ethiopia, City: Addis, State: 1 union circle, Visited Date: 2/23/2020
            Name: NewYork, Address: 1 center Ave, City: brookly, State: Newyork, Visited Date: 05/07/2020

         */

        String patientFlag = "y";
        String haveSymptom;
        String haveMeet;
        String haveVisit;
        ArrayList<ContactedPerson> listOfContacts = new ArrayList<>();
        ArrayList<VisitedPlace> listOfVisitedPlaces = new ArrayList<>();
        ArrayList<Sysmptom> listOfSymptoms = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        Searcher newSearch = new Searcher();
        Patient newPatient;
        Sysmptom newSymptom;
        VisitedPlace newVisitedPlace;
        ContactedPerson newContacted;

        ArrayList<String> majorSysmptoms = new ArrayList<>();
        majorSysmptoms.add("Fever");
        majorSysmptoms.add("Cough");
        majorSysmptoms.add("Shortness of breath or difficulty breathing");
        majorSysmptoms.add("Tiredness");
        majorSysmptoms.add("Aches");
        majorSysmptoms.add("Chills");
        majorSysmptoms.add("Sore throat");
        majorSysmptoms.add("Loss of smell");
        majorSysmptoms.add("Loss of taste");
        majorSysmptoms.add("Headache");
        majorSysmptoms.add("Diarrhea");
        majorSysmptoms.add("Severe vomiting");


        System.out.println("------ Contact Tracing Program -------");
        while (patientFlag.equalsIgnoreCase("Y")) {
            newPatient = new Patient();
            System.out.println("Enter Newly Infected Person. ");
            System.out.print("What is a patient's name ? ");
            newPatient.setName(in.nextLine());
            System.out.print("What is a patient's phone number?(xxx-xxx-xxxx): ");
            newPatient.setPhoneNumber(in.nextLine());
            System.out.print("What is a patient's email ? ");
            newPatient.setEmail(in.nextLine());
            System.out.print("What is a patient's address ? ");
            newPatient.setAddress(in.nextLine());
            System.out.print("What is a patient's city ? ");
            newPatient.setCity(in.nextLine());
            System.out.print("What is a patient's state ? ");
            newPatient.setState(in.nextLine());
            System.out.println();

            for (String symptom : majorSysmptoms) {
                newSymptom = new Sysmptom();
                System.out.print("Does " + newPatient.getName() + " have any symptom for " + symptom + " ? (y/n) ");
                haveSymptom = in.nextLine();
                if (haveSymptom.equalsIgnoreCase("Y")) {
                    newSymptom.setSymptom(symptom);
                    System.out.print("How long has  " + newPatient.getName() + "  had this symptom for ? ");
                    newSymptom.setNumbersOfDays(in.nextInt());
                    in.nextLine();
                    listOfSymptoms.add(newSymptom);
                }

            }
            newPatient.setSymptoms(listOfSymptoms);
            System.out.println();

            System.out.print("Have " + newPatient.getName() + " met or run into anyone else ? (y/n) ");
            haveMeet = in.nextLine();
            while (haveMeet.equalsIgnoreCase("Y")) {
                newContacted = new ContactedPerson();
                System.out.print("What is his/her name? ");
                newContacted.setName(in.nextLine());
                System.out.print("What is " + newContacted.getName() + "'s phone number?(xxx-xxx-xxxx) ");
                newContacted.setPhoneNumber(in.nextLine());
                System.out.print("What is " + newContacted.getName() + "'s email ? ");
                newContacted.setEmail(in.nextLine());
                System.out.print("What is " + newContacted.getName() + "'s address ? ");
                newContacted.setAddress(in.nextLine());
                System.out.print("What city does " + newContacted.getName() + " lives in ? ");
                newContacted.setCity(in.nextLine());
                System.out.print("What state does " + newContacted.getName() + " live in ? ");
                newContacted.setState(in.nextLine());
                System.out.print("Where is the contact location/address of " + newPatient.getName() + " and "
                        + newContacted.getName() + " ? ");
                newContacted.setLocationOfContact(in.nextLine());
                System.out.print("When did " + newPatient.getName() + " see " + newContacted.getName() + " ? (mm/dd/yyyy) ");
                newContacted.setDateOfContact(in.nextLine());

                listOfContacts.add(newContacted);
                System.out.print("Have " + newPatient.getName() + " met or run into anyone else ? (y/n) ");
                haveMeet = in.nextLine();
            }
            newPatient.setListOfContacts(listOfContacts);
            System.out.println();

            System.out.print("Did " + newPatient.getName() + " visited anywhere in pass 14 days ? (y/n) ");
            haveVisit = in.nextLine();

            while (haveVisit.equalsIgnoreCase("Y")) {
                newVisitedPlace = new VisitedPlace();
                System.out.print("What is the name of a visited place ? ");
                newVisitedPlace.setVisitPlace(in.nextLine());
                System.out.print("What is the located/address of " + newVisitedPlace.getVisitPlace() + " ? ");
                newVisitedPlace.setVisitAddress(in.nextLine());
                System.out.print("Which city is " + newVisitedPlace.getVisitPlace() + " located in ? ");
                newVisitedPlace.setVisitCity(in.nextLine());
                System.out.print("Which state is " + newVisitedPlace.getVisitPlace() + " located in ? ");
                newVisitedPlace.setVisitState(in.nextLine());
                System.out.print("When did " + newPatient.getName() + " visited to " + newVisitedPlace.getVisitPlace() + " ? (mm/dd/yyyy) ");
                newVisitedPlace.setVisitDate(in.nextLine());

                listOfVisitedPlaces.add(newVisitedPlace);
                System.out.print("Did " + newPatient.getName() + " visited anywhere in pass 14 days ? (y/n) ");
                haveVisit = in.nextLine();

            }
            newPatient.setVisitedPlaceList(listOfVisitedPlaces);
            newSearch.addPatient(newPatient);
            System.out.println();
            newPatient.displayPatient();


            System.out.print("Any new patient?");
            patientFlag = in.nextLine();
        }
        System.out.print("Which place you search for patient?");
        newSearch.searchPatientsByPlace(in.nextLine());
    }
}
