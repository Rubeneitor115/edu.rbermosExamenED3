package Servicios;

/***
 * Implementación de la interfaz Menú
 * rbr - 080324
 */
public class MenuImplementacion implements MenuInterfaz{

	/***
	 * Método que mostrará el menú inicial por consola
	 * rbr - 080324
	 */
	public void menuInicial() {
		System.out.println("                                           ");
		System.out.println("                MENÚ INICIAL               ");
		System.out.println("-------------------------------------------");
		System.out.println("1. CERRAR                                  ");
		System.out.println("2. MENU DEL EMPLEADO                       ");
		System.out.println("3. MENU DEL GERENTE                        ");
		System.out.println("-------------------------------------------");
		System.out.println("Seleccione una opción: ");
		
	}

	/***
	 * Método que mostrará el menú del empleado por consola
	 * rbr - 080324
	 */
	public void menuEmpleado() {
		System.out.println("                                           ");
		System.out.println("             MENÚ DEL EMPLEADO             ");
		System.out.println("-------------------------------------------");                              
		System.out.println("1. TOTAL DE VENTAS MENSUAL                 ");
		System.out.println("2. AÑADIR COMPRA                           ");
		System.out.println("-------------------------------------------");
		System.out.println("Seleccione una opción: ");
		
	}

	/***
	 * Método que mostrará el menú del gerente por consola
	 * rbr - 080324
	 */
	public void menuGerente() {
		System.out.println("                                           ");
		System.out.println("              MENÚ DEL GERENTE             ");
		System.out.println("-------------------------------------------");                            
		System.out.println("1. MOSTRAR TODAS LAS COMPRAS               ");
		System.out.println("2. CREAR NUEVO CLIENTE                     ");
		System.out.println("-------------------------------------------");
		System.out.println("Seleccione una opción: ");
		
	}

	
}
