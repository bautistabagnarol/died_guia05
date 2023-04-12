package died.guia05.ejercicio02;

public class PedidoBasico extends Pedido {
	private String tipoEnvio;

public PedidoBasico(String tipoEnvio) {
	// TODO Auto-generated constructor stub
	this.tipoEnvio=tipoEnvio;
}	


public boolean agregarProducto(Producto p) {
	if (this.getProductos().size() < 5) {
		this.getProductos().add(p);
		return true;
	} else {
		return false;
	}
}

	@Override
	public double precio() {
		double precioFinal = 0.0;
		if (this.getProductos().size() <= 5) {
			for (Producto producto : this.getProductos()) {
				precioFinal += producto.getCosto();
				precioFinal += (5 * producto.getCosto()) / 100;
			}
			if (this.tipoEnvio == "Express") {
				precioFinal += ((20 * precioFinal) / 100);
				this.setPrecioFinal(precioFinal);

			} else {
				this.setPrecioFinal(precioFinal);

			}
		}
		return precioFinal;
	}

	@Override
	public double comision() {
	if(this.getFechaEntrega()!=null){
		double comision = 0.0;
		comision += ((this.getPrecioFinal() * 10) / 100);
		return comision;
	}else return 0.0;
	}

}
