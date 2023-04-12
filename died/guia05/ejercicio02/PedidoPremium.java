package died.guia05.ejercicio02;

public class PedidoPremium extends Pedido {

	

	@Override
	public double precio() {
		double precioFinal = 0.0;
		if (this.getProductos().size() <= 5) {
			for (Producto producto : this.getProductos()) {
				precioFinal += producto.getCosto();
				precioFinal += (20 * producto.getCosto()) / 100;
			}
		}
		if (5 < this.getProductos().size() && this.getProductos().size() <= 20) {
			for (Producto producto : this.getProductos()) {
				precioFinal += producto.getCosto();
				precioFinal += (30 * producto.getCosto()) / 100;
			}
		}
		this.setPrecioFinal(precioFinal);
		return precioFinal;

	}

	@Override
	public double comision() {
		double comision = 0.0;
		comision += ((this.getPrecioFinal() * 15) / 100);
		if (this.getProductos().size() > 10) {
			return comision += 20;
		}
		return comision;

	}

	@Override
	public boolean agregarProducto(Producto p) {
		if (this.getProductos().size() < 20) {
			this.getProductos().add(p);
			return true;
		} else {
			return false;
		}
	}

}
