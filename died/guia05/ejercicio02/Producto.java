package died.guia05.ejercicio02;

public class Producto {
private String descripcion;
private Double costo;

public Producto(String descripcion,double costo) {
	// TODO Auto-generated constructor stub
	this.descripcion=descripcion;
	this.costo=costo;
}


public String getDescripcion() {
	return descripcion;
}

public Double getCosto() {
	return costo;
}
}
