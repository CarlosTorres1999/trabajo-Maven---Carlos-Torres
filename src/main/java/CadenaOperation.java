/**
 * Clase para operar con Strings
 * @author Carlos Cristobal Torres Caballo
 *
 */
public class CadenaOperation {
	public static String concatDosCadena(String st1, String st2) {
		if(st1.equals(null) || st2.equals(null)) {
			throw new NullPointerException("No se aceptan valores nulos");
		}
		return st1+st2;
	}
	public static <T extends String> String concatMultiple(T...  args) {
		String cad = "";
		for(String s: args) {
			cad += s;
		}
		return cad;
		
	}

	
}
