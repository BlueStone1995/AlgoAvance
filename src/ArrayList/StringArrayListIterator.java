package ArrayList;

import ArrayList.StringArrayList;

import java.util.Iterator;

public class StringArrayListIterator implements Iterator<String> {

    private StringArrayList al;
    private static int position;


    StringArrayListIterator(StringArrayList al) {
        this.al = al;
        position = -1;
    }

    @Override
    public boolean hasNext() {

        return (position < al.getElementData().length);
    }

    @Override
    public String next() {
        position++;
        if (this.hasNext()) {
            return al.get(position);
        }
        return "]";
    }
}
