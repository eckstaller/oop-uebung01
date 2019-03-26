package ueb01;

public class StackElem {
    char v;
    private StackElem next;

    public StackElem(char v) {
        this.v = v;
    }

    StackElem getNext(){
        return next;
    }

    public void setNext(StackElem se) {
        this.next = se;
    }
}
