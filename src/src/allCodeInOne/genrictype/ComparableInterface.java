package allCodeInOne.genrictype;

public class ComparableInterface<T extends Comparable<T>> implements Comparable<T>{
    private T myVariable;
    public ComparableInterface(T myVariable) {
        this.myVariable=myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(T o) {
        return getMyVariable().compareTo(o);
    }
}
