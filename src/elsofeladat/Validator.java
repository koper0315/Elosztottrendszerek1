package elsofeladat;

public interface Validator<T> {
    boolean isValid(T object);
}
