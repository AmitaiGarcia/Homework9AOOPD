package ws1.Observers;

public interface Observer<T> {
    public void update(T data);

    public String getType();
}
