package Servicios;

import java.util.List;

import Dtos.VentasDto;

/***
 * Interfaz para la operativa de la aplicación
 * rbr - 080324
 */
public interface OperativaInterfaz {
	
	/***
	 * Enunciado de los métodos que tendrá la implementación
	 * rbr - 080324
	 */
	public List<VentasDto> crearCompra(List<String> listaClientes, List<VentasDto> listaVentas);
	public void totalVentas();
	public void mostrarCompras(List<String> listaClientes, List<VentasDto> listaVentas);
	public List<String> nuevoCliente(List<String> listaClientes);
}
