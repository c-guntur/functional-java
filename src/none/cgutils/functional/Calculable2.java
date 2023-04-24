package none.cgutils.functional;

// NOTE: A <generic> calculable interface.
//  • T identifies the Type being used.
//  • Can use any valid name instead of T.
//  • Multiple types can be listed with commas.
public interface Calculable2<T> {

    T add(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);

    T divide(T a, T b);
}
