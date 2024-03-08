package Dtos;

import java.util.Date;

/***
 * Clase de tipo entidad para las ventas
 * rbr - 080324
 */
public class VentasDto {

	//Atributos
	int idVenta;
	int idCliente;
	int euros;
	Date fechaVenta;
	
	//Getters y Setters
	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getEuros() {
		return euros;
	}

	public void setEuros(int euros) {
		this.euros = euros;
	}

	public Date getFechaVenta(int i) {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	//Constructores
	public VentasDto(int idVenta, int idCliente, int euros, Date fechaVenta) {
		super();
		this.idVenta = idVenta;
		this.idCliente = idCliente;
		this.euros = euros;
		this.fechaVenta = fechaVenta;
	}
	public VentasDto() {
		
	}
	
	//Metodo ToString
	public String ToString() {
		return ("Id: " + this.idVenta +
				" Id del cliente: " + this.idCliente +
				" Euros: " + this.euros +
				" Fecha de la venta: " + this.fechaVenta);
	}
}
