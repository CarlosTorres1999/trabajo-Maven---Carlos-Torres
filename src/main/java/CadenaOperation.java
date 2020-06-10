/**
 * Clase para operar con Strings
 * @author Carlos Cristobal Torres Caballo
 *
 */
public class CadenaOperation {
	/**
	 * Metodo para concatenar dos cadenas
	 * @param st1 cadena 1
	 * @param st2 cadena dos
	 * @return la cadena concatenada
	 */
	public static String concatDosCadena(String st1, String st2) {
		if(st1.equals(null) || st2.equals(null)) {
			throw new NullPointerException("No se aceptan valores nulos");
		}
		return st1+st2;
	}
	/**
	 * Sirve para concatenar maws de un String
	 * @param <T> Generics que hereda de String
	 * @param args Para recibir multiple String
	 * @return la concatenacion de las cadenas
	 */
	public static <T extends String> String concatMultiple(T...  args) {
		String cad = "";
		for(String s: args) {
			cad += s;
		}
		return cad;
		
	}

	
}
