import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * Clase que permite hacer operaciones con numeros y conjuntos de numeros
 * @author Carlos Cristobal Torres Carballo
 *
 */
public class Operation {
	/**
	 * Calcula el factorial de un numero
	 * @param factorial el factorial que se desea calcular
	 * @return el resultado del factorial
	 */
	public static int factorial(int factorial) {
		if(factorial == 0 ||factorial == 1) {
			return 1;
		}
		return IntStream.rangeClosed(1, factorial).reduce(1, (a,b) -> a*b);
	}
	/**
	 * Calcula la sumatoria de un numero
	 * @param n desde 1 hasta n
	 * @return 1 si n = 0 | la sumatoria
	 */
	public static int sumatoria(int n) {
		return IntStream.rangeClosed(0, n).reduce(0, (a,b) -> a + b);
	}
	/**
	 * Calcula la division, si y = 0; lanzara un error
	 * @param x dividendo
	 * @param y divisor
	 * @return el resultado piso de la division
	 */
	public static int dividir(int x, int y) {
		if(y == 0) {
			throw new IllegalArgumentException("Error, y no debe ser igual a 0");
		}
		return x/y;
	}
	/**
	 * Agrega a un nuevo arreglo los numeros pares de otro arreglo
	 * @param numeros un nuevo 
	 * @return un nuevo arreglo
	 */
	
	public static ArrayList<Integer> soloPares(ArrayList <Integer> numeros) {
		ArrayList<Integer> numPares =(ArrayList<Integer>) numeros.stream()
				.filter(n -> (n%2 == 0))
				.collect(Collectors.toList());
		return numPares;
				
	}
	/**
	 * Verifica si el arreglo introducido contiene al menos un impar
	 * @param num un arreglo
	 * @return Un String que verifica si hay un numero impar
	 */
	public static String verificarImparidad(ArrayList<Integer> num) {
		boolean b = num.stream()
				.anyMatch(n -> n%2 != 0);
		String result = (b == true)?("Existe Impares"):("No Existen Impares");
		return result;
	}
	
}
