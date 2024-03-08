package Controladores;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.VentasDto;
import Servicios.MenuInterfaz;
import Servicios.MenuImplementacion;
import Servicios.OperativaInterfaz;
import Servicios.OperativaImplementacion;
/***
 * Clase principal de la aplicación
 * rbr - 080324
 */
public class Principal {

	/***
	 * Método principal de la aplicación
	 * rbr - 080324
	 * @param args
	 */
	public static void main(String[] args) {
		//Declaro las variables
		int opcion;
		Scanner sc = new Scanner(System.in);
		List<String> listaClientes = new ArrayList<String>();
		List<VentasDto> listaVentas = new ArrayList<VentasDto>();
		
		//Instancio las interfaces con sus implementaciones
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		do {
			mi.menuInicial();
			opcion = sc.nextInt();
			switch(opcion) {
			case 1: 
				break;
			case 2:
				mi.menuEmpleado();
				opcion = sc.nextInt();
				switch(opcion) {
				case 1:
					oi.totalVentas();
					break;
				case 2:
					oi.crearCompra(listaClientes, listaVentas);
					break;
				default: 
					System.out.println("Esa opcion no es válida");
					break;
				}
				break;
			case 3:
				mi.menuGerente();
				opcion = sc.nextInt();
				switch(opcion) {
				case 1:
					oi.mostrarCompras(listaClientes, listaVentas);
					break;
				case 2:
					oi.nuevoCliente(listaClientes);
					break;
				default: 
					System.out.println("Esa opcion no es válida");
					break;
				}
				break;
			default:
				System.out.println("Esa opcion no es válida");
				break;
			}
		}while (opcion!=1);

	}

}
