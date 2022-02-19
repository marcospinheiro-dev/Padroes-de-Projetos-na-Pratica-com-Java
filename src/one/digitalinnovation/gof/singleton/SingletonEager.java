package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 *
 * @autor falvojr
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
       return instancia;
    }
}
