import java.util.List;

public class ArraysOperationen {

    public List<Integer> elems;

    ArraysOperationen(List<Integer> elems){
        this.elems = elems;
    }

    public int maximaleZahl(){
        return this.elems.stream().max(Integer::compare).get();
    }

    public int minimaleZahl(){
        return this.elems.stream().min(Integer::compare).get();
    }

    public int maximaleSumme(){
        return elems.stream().reduce(0,(a,b)->a+b) - minimaleZahl();
    }

    public int minimaleSumme(){
        return elems.stream().reduce(0,(a,b)->a+b) - maximaleZahl() ;
    }

}
