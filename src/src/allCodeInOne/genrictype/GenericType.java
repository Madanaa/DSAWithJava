package allCodeInOne.genrictype;

public class GenericType<T> {
    private T data;

    public GenericType(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
