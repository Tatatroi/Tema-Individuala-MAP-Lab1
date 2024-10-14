import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ubung 1
        AfisareNote listaNote = new AfisareNote(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53,100));
        System.out.println(listaNote.notePicate(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53,100)));
        System.out.println(listaNote.mediaPeClasa(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53,100)));
        System.out.println(listaNote.noteRotunjite(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53,100)));
        System.out.println(listaNote.notaMaximaRotunjita(listaNote.noteRotunjite(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53))));

        // Ubung 2
        ArraysOperationen elem = new ArraysOperationen(Arrays.asList(3,6,5,7,11,15,32,56,100));
        System.out.println("Minimale Zahl: " + elem.maximaleZahl());
        System.out.println("Minimale Zahl: " + elem.minimaleZahl());
        System.out.println("Minimale Summe: " + elem.minimaleSumme());
        System.out.println("Maximale Summe: " + elem.maximaleSumme());

        // Ubung 3
        BigNumbersOperationen bigOp = new BigNumbersOperationen();
        List<Integer> suma = bigOp.summeGrossZahlen(Arrays.asList(1,3,0,0,0,0,0,0,0), Arrays.asList(8,7,0,0,0,0,0,0,0));
        System.out.println("Suma: " + suma);
        List<Integer> inmultire = bigOp.multiplikationGrosseZahlen(Arrays.asList(2,3,6,0,0,0,0,0,0),2);
        System.out.println("Inmultire: " + inmultire);
        List<Integer> scadere = bigOp.diferenzZahlen(Arrays.asList(8,3,0,0,0,0,0,0,0), Arrays.asList(5,4,0,0,0,0,0,0,0));
        System.out.println("Scadere: " + scadere);
        List<Integer> impartire = bigOp.divisionGrosseZahlen(Arrays.asList(2,3,6,0,0,0,0,0,0),2);
        System.out.println("Impartire: " + impartire);

        //Ubung 4


    }
}