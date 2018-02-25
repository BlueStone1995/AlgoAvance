package SimpleList;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorString implements Iterator<String>{
    int position=0;
    ArrayList<String> s;
    SimpleList k=new SimpleList();
    public IteratorString(SimpleList l) {
        this.k = l;
        this.s=l.datainList;
    }

    public boolean hasNext() {
        return this.position<this.s.size();
    }

    @Override
    public String next() {
        this.position++;
        return this.s.get(this.position-1);
    }

}
