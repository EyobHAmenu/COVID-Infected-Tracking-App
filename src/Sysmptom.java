import java.util.HashMap;
import java.util.Map;

public class Sysmptom {
    private String symptom;
    private int numbersOfDays;
    private String description;

    public Sysmptom(){
    }

    public String getSymptom(){
        return symptom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSymptom(String symptom){
        this.symptom = symptom;
    }

    public int getNumbersOfDays(){
        return numbersOfDays;
    }

    public void setNumbersOfDays(int numbersOfDays){
        this.numbersOfDays = numbersOfDays;
    }

    public void displaySymptom(){

        System.out.println("Have " + symptom + " for " + numbersOfDays);
    }
}
