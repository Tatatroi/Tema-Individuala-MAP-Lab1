import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();

        // Ubung 1
        AfisareNote listaNote = new AfisareNote(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53,100));
        System.out.println("Note picate: " + listaNote.notePicate(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53,100)));
        System.out.println("Media pe clasa: " + listaNote.mediaPeClasa(Arrays.asList(12,23,39,56,87,97,34,87,53,97,53,100)));
        System.out.println("Note rotunjite" + listaNote.noteRotunjite(Arrays.asList(12,23,39,56,89,97,34,87,58,97,53,99)));
        System.out.println("Nota maxima rotunjita: " + listaNote.notaMaximaRotunjita(listaNote.noteRotunjite(Arrays.asList(12,23,39,56,89,97,34,87,58,97,53,99))));

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();

        // Ubung 2
        ArraysOperationen elem = new ArraysOperationen(Arrays.asList(3,6,5,7,11,15,32,56,100));
        System.out.println("Minimale Zahl: " + elem.maximaleZahl());
        System.out.println("Minimale Zahl: " + elem.minimaleZahl());
        System.out.println("Minimale Summe: " + elem.minimaleSumme());
        System.out.println("Maximale Summe: " + elem.maximaleSumme());

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();

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

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();


        //Ubung 4
        ElektronikShop ekShop = new ElektronikShop();

        System.out.println("Minimale tastatur: " + ekShop.minimaleTastatur(Arrays.asList(40,35,70,15,45)));
        System.out.println("Maximale tastatur/USB: " + ekShop.maximalePrice(Arrays.asList(15,20,10,35),Arrays.asList(20,15,40,15)));
        System.out.println("Afordable tastatur: " + ekShop.affordableTastatur(Arrays.asList(15,45,20),30));
        System.out.println("Afordable pair: " + ekShop.affordablePair(Arrays.asList(8,12),Arrays.asList(40,60),60));

    }
}