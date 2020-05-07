import java.util.HashMap;
import java.util.Map;

public class Sysmptom {
    private String symptom;
    private int numbersOfDays;
    private HashMap<String, Integer> symptomList = new HashMap<>();

    public Sysmptom() {
    }

    public HashMap<String, Integer> getSymptomList() {
        return symptomList;
    }

    public void setSymptomList(String symptom,int numbersOfDays) {
        this.symptomList.put(symptom,numbersOfDays);
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getNumbersOfDays() {
        return numbersOfDays;
    }

    public void setNumbersOfDays(int numbersOfDays) {
        this.numbersOfDays = numbersOfDays;
    }

    public String displaySymptoms(){
        String symptomDays = "";
        for (Map.Entry<String, Integer> x : symptomList.entrySet()){
            symptomDays += "had " + x.getKey() + " for " + x.getValue() + " days. \n";
        }
        return symptomDays;
    }
}
