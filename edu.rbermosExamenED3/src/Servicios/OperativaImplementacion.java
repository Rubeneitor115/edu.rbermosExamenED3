package Servicios;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;
import Dtos.VentasDto;

public class OperativaImplementacion implements OperativaInterfaz{

	/***
	 * Método que creará una nueva compra para un cliente
	 * rbr - 080324
	 */
	public List<VentasDto> crearCompra(List<String> listaClientes, List<VentasDto> listaVentas) {
		
		System.out.println("Listado de clientes:");
		for(var cliente : listaClientes) {
			System.out.println(cliente);
		}
		
		Date fechaActual = new Date();
		VentasDto venta = new VentasDto();
		Scanner sc = new Scanner(System.in);
		venta.setIdVenta(listaVentas.size()+1);
		System.out.println("Indica el id del cliente que compra: ");
		venta.setIdCliente(sc.nextInt());
		System.out.println("Indica el importe de la compra: ");
		venta.setEuros(sc.nextInt());
		venta.setFechaVenta(fechaActual);
		
		listaVentas.add(venta);
		
		return listaVentas;
	}

	/***
	 * Método que mostrará el total de ventas en euros de un mes
	 * rbr - 080324
	 */
	public void totalVentas() {


		System.out.println("Indica la fecha: ");
		Scanner sc = new Scanner(System.in);
		
	}

	/***
	 * Método que mostrará por consola todas las compras de un cliente
	 * rbr - 080324
	 */
	public void mostrarCompras(List<String> listaClientes, List<VentasDto> listaVentas) {
		
		ClienteDto cliente = new ClienteDto(); 
		System.out.println("Listado de clientes:");
		for(var client : listaClientes) {
			System.out.println(client);
		}
		
		
		VentasDto venta = new VentasDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el id del cliente: ");
		int id = sc.nextInt();
		for(var client : listaClientes) {
			if(cliente.getIdCliente() == venta.getIdCliente()) {
				System.out.println("Id de la venta: " + venta.getIdVenta());
				int euros = 0;
				int tiempo = 0;
				for(int i=0; i<listaClientes.size(); i++){
					euros = euros + venta.getEuros();
					tiempo = venta.getFechaVenta(listaClientes.size()).getHours() - venta.getFechaVenta(0).getHours();
				}
				System.out.println("Importe total: " + euros);
				System.out.println("Tiempo transcurrido: " + tiempo + " horas");
			}
		}
		
		
	}

	/***
	 * Método que creará un nuevo cliente
	 * rbr - 080324
	 */
	public List<String> nuevoCliente(List<String> listaClientes) {
		
		ClienteDto cliente = new ClienteDto();
		Scanner sc = new Scanner(System.in);
		cliente.setIdCliente(listaClientes.size()+1);
		System.out.println("Introduce el nombre del cliente: ");
		cliente.setNombre(sc.next());
		System.out.println("Introduce los apellidos del cliente: ");
		cliente.setApellidos(sc.next());
		
		listaClientes.add(cliente.getIdCliente() + " " + cliente.getNombre() + " " + cliente.getApellidos());
		
		return listaClientes;
	}

}
