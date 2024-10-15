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
            if(nota < 38) temp.add(nota);
        }

        return temp;
    }

    // Zweite Methode
    public int mediaPeClasa(List<Integer> noteElevi) {
        //int suma = noteElevi.stream().reduce(0,(a,b)->a+b);
        int suma = 0;
        for(int i = 0; i<noteElevi.size(); i++) {
            suma += noteElevi.get(i);
        }
        return suma/noteElevi.size();
    }

    //Dritte Methode

    public List<Integer> noteRotunjite(List<Integer> noteElevi) {
        List<Integer> temp = new ArrayList<>();
        for(Integer nota : noteElevi ) {
            if(nota < 38)temp.add(nota);
            else if(nota >= 38 && nota <= 100){
                if(nota % 5 == 3 || nota % 5 == 4)temp.add(nota + (5 - nota % 5));
                else temp.add(nota);
            }
        }
        return temp;
    }

    public int notaMaximaRotunjita(List<Integer> noteElevi) {
        //return noteElevi.stream().max(Integer::compare).get();
        int Max = -1;
        for(int i = 0; i<noteElevi.size(); i++) {
            if(noteElevi.get(i) > Max) Max = noteElevi.get(i);
        }
        return Max;
    }

}
