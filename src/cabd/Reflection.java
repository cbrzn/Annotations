package cabd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Information inf = new Information();
		inf.setCedula(23736258);
		inf.setNombre("Cesar");
		inf.setApellido("Brazon");
		Method method = inf.getClass().getMethod("imprimir", int.class, String.class, String.class);
		method.invoke(inf, inf.getCedula(), inf.getNombre(), inf.getApellido());
			}
		}
	