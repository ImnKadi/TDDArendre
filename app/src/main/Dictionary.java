package tdd;

import java.util.ArrayList;

public class Dictionary {

    String Undictionnaire;
    private ArrayList<String> Mot;
    private ArrayList<String> trad;

    public Dictionary(String Undictionnaire) {
        this.Undictionnaire = Undictionnaire;
        Mot = new ArrayList<>();
        trad = new ArrayList<>();
    }

    public String getUndictionnaire() {
        return this.Undictionnaire;
    }

    public void setUndictionnaire(String Undictionnaire) {
        this.Undictionnaire = Undictionnaire;
    }

    public void addTranslation(String mot, String traduction) {
        this.Mot.add(mot);
        this.trad.add(traduction);
        System.out.println("le mot " + mot + " a pour traduction " + traduction);
    }

    public String getTranslation(String mot) {
        int index = 0;
        System.out.println("Le programme cherche la traduction de :" + mot);
        for (String s : Mot) {
            if (mot.equals(s)) {
                return trad.get(index);
            }
            index++;
        }
        return null;
    }

}