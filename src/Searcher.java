import java.util.ArrayList;

public class Searcher {

    ArrayList<Patient> listOfPatients = new ArrayList<>();

    public void addPatient(Patient patient) {
        this.listOfPatients.add(patient);
    }

    public void searchPatientsByPlace(String place){
        for(Patient p : listOfPatients) {
            for(VisitedPlace v : p.getVisitedPlaceList()) {
                if (v.getVisitPlace().equalsIgnoreCase(place)){
                    System.out.println(p.getName());
                }
            }
        }
    }
}
