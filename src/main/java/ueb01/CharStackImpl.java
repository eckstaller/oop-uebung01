package ueb01;

public class CharStackImpl implements CharStack {
    private StackElem first;
    private int counter;
    public CharStackImpl() {
        first = null;
        counter = 0;
    }


    @Override
    public void push(char c) {
       StackElem se = first;
       first = new StackElem(c);
       first.setNext(se);
       counter++;
    }

    @Override
    public char pop() {
        if (first == null) throw new java.util.NoSuchElementException();
        char v = first.v;
        first = first.getNext();
        counter--;
        return v;
    }

    @Override
    public int size() {
        return counter;
    }
}
