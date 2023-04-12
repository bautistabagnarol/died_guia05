package died.guia05.ejercicio02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido implements Comisionable {

	private List<Producto> productos = new ArrayList<Producto>();
	private double precioFinal = 0.0;
	private LocalDateTime fechaEntrega = null;

	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	public void setFechaEntrega(LocalDateTime localDateTime) {
		this.fechaEntrega = localDateTime;
	}
	
	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}


	public abstract boolean agregarProducto(Producto p);

	public abstract double precio();

	public abstract double comision();

}