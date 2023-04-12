package died.guia05.ejercicio02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cadete {
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private List<Tramite> tramites = new ArrayList<Tramite>();

	public Cadete() {
		
	}

	public void agregarPedido(Pedido p) {
		pedidos.add(p);
	}

	public double comisiones() {
		double comisionesTotales = 0.0;
		for (Pedido pedido : pedidos) {
			if (pedido.getFechaEntrega() != null) {
//			por cada pedido le calculo el precio final con .precio(), y luego utilizo ese precio final para sacar la comision
				pedido.precio();
				if (pedido instanceof PedidoBasico) {
					comisionesTotales += (pedido.getPrecioFinal() * 0.1);
				}
				if (pedido instanceof PedidoPremium) {
					if (pedido.getProductos().size() > 10) {
						comisionesTotales += 50;
					}
					comisionesTotales += (pedido.getPrecioFinal() * 0.15);
				}
			}
		}

		for (Tramite tramite : tramites) {
			comisionesTotales += tramite.comision();
		}

		return comisionesTotales;

	}

	public void entregarPedido(Pedido p) {
		p.setFechaEntrega(LocalDateTime.now());
	}
}
