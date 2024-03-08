package Dtos;



/***
 * Clase de tipo entidad para los clientes
 * rbr - 080324
 */
public class ClienteDto {

	//Atributos
	int idCliente;
	String nombre;
	String apellidos;
	
	//Getters y Setters
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	//Constructores
	public ClienteDto(int idCliente, String nombre, String apellidos) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public ClienteDto() {
		
	}
	
	//Método ToString
	public String ToString() {
		return ("Id: " + this.idCliente +
				"Nombre: " + this.nombre + 
				"Apellidos: " + this.apellidos);
	}
}
