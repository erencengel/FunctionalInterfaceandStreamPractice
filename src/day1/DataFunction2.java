package day1;

@FunctionalInterface
public interface DataFunction2<T,R> {
    T function(T t, R r);
}
