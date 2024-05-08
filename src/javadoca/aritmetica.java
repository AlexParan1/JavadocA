
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones aritméticas básicas.
 */
public class aritmetica {

/**
 * Sumamos dos numeros int (a y b)
 * @param a es el primer numero
 * @param b es el segundo numero
 * @return la suma de a y b
 */
    public int sumar(int a, int b) {
        return a + b;
    }

/**
 * 
 * Restamos dos numeros int (a y b)
 * @param a es el primer numero
 * @param b es el segundo numero
 * @return la resta de a y b
 */
    public int restar(int a, int b) {
        return a - b;
    }
/**
 * 
 * Multiplicamos dos numeros int (a y b)
 * @param a es el primer numero
 * @param b es el segundo numero
 * @return la multiplicacion de a y b
 */
    public int multiplicar(int a, int b) {
        return a * b;
    }
/**
 * 
 * Dividimos dos numeros int (a y b)
 * @param a es el primer numero
 * @param b es el segundo numero
 * @return la division de a y b o error si b es 0
 */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

