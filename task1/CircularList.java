package task1;

import java.util.ArrayList;
import java.util.Collection;

public class CircularList<E> extends ArrayList<E> {
    public CircularList(int initialSize) {
        super(initialSize);
    }

    public CircularList() {
    }

    public CircularList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public E get(int index) {
        return super.get(index % size());
    }
}
