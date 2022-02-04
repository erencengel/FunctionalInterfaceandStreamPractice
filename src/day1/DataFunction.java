package day1;

@FunctionalInterface //this one is optional, as long as you provide just one abstract method in the interface, then it means that it is functional interface
public interface DataFunction<T> {

    T function(T t);

}