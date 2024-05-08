
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones matemáticas avanzadas.
 */
public class operaciones {

    /**
     * Tras introducir dos valores int (a y b)
     * @param a representara el dividendo
     * @param b representa el divisor
     * @return error en caso de que b sea 0 o devuelve el resultado de la division de a por b
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

 /**
  * Pide un int (a) (sera el lado de un cuadrado)
  * @param a es el entero que deseemos
  * @return a multiplicado por si mismo que sera el area del cuadrado
  */
    public int calcularCuadrado(int a) {
        return a * a;
    }
/**
 * Pide un double (a) para calcular su raiz cuadrada
 * @param a es el numero cuya raiz calculara
 * @return error en caso de ser 0, si no es cero devolvera la raiz del numero elegido
 */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

