import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AfisareNote {

    List<Integer> noteElevi = new ArrayList<>();

    AfisareNote(List<Integer> noteElevi){
        this.noteElevi = noteElevi;
    }

    // Erste Methode


    public List<Integer> notePicate(List<Integer> noteElevi) {
        List<Integer> temp = new ArrayList<>();

        for(Integer nota : noteElevi ) {
            if(nota < 38)temp.add(nota);
        }

        return temp;
    }

    // Zweite Methode
    public int mediaPeClasa(List<Integer> noteElevi) {
        int suma = noteElevi.stream().reduce(0,(a,b)->a+b);
        return suma/noteElevi.size();
    }

    //Dritte Methode

    public List<Integer> noteRotunjite(List<Integer> noteElevi) {
        List<Integer> temp = new ArrayList<>();
        for(Integer nota : noteElevi ) {
            if(nota < 38)temp.add(nota);
            else if(nota >= 38 && nota <= 100){
                if(nota % 5 == 1 && nota % 5 == 2)temp.add(nota + (5 - nota % 5));
                else temp.add(nota);
            }
        }
        return temp;
    }

    public int notaMaximaRotunjita(List<Integer> noteElevi) {
        return noteElevi.stream().max(Integer::compare).get();
    }

}
