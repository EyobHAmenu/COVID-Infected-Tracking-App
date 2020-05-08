import java.util.HashMap;

public class VisitedPlace {
    private String visitPlace;
    private String visitAddress;
    private String visitCity;
    private String visitState;
    private String visitDate;

    public VisitedPlace() {
    }

    public VisitedPlace(String visitAddress, String visitCity, String visitState, String visitDate) {
        this.visitAddress = visitAddress;
        this.visitCity = visitCity;
        this.visitState = visitState;
        this.visitDate = visitDate;
    }

    public String getVisitPlace() {
        return visitPlace;
    }

    public void setVisitPlace(String visitPlace) {
        this.visitPlace = visitPlace;
    }

    public String getVisitAddress() {
        return visitAddress;
    }

    public void setVisitAddress(String visitAddress) {
        this.visitAddress = visitAddress;
    }

    public String getVisitCity() {
        return visitCity;
    }

    public void setVisitCity(String visitCity) {
        this.visitCity = visitCity;
    }

    public String getVisitState() {
        return visitState;
    }

    public void setVisitState(String visitState) {
        this.visitState = visitState;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void displayVisists(){
        System.out.println("Name: " + getVisitPlace() + ", Address: " + getVisitAddress() + ", City: "
                + getVisitCity() + ", State: " + getVisitState() + ", Visited Date: " + getVisitDate());
    }

}
