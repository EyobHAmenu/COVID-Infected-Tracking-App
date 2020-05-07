import java.util.ArrayList;

public class Visit {

    private String visitPlace;
    private String visitAddress;
    private String visitCity;
    private String visitState;
    private String visitDate;


    public Visit() {
    }

    public Visit(String visitAddress, String visitCity, String visitState, String visitDate) {
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

}
