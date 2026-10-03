package interfacesFuncionales.ejercicio2;

@FunctionalInterface
public interface Combinador<T, U, R> {
    R combinar(T primero, U segundo);
}
