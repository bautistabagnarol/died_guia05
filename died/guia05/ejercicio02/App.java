package died.guia05.ejercicio02;

public class App {

	public static void main(String[] args) {
	Producto p1 = new Producto("chocolatada",100);
	Producto p2 = new Producto("chocolatada",100);
	Producto p3 = new Producto("chocolatada",100);
	Producto p4 = new Producto("chocolatada",100);
	Producto p5 = new Producto("chocolatada",100);
	Producto p6 = new Producto("chocolatada",100);
	Producto p7 = new Producto("chocolatada",100);
	Producto p8 = new Producto("chocolatada",100);
	Producto p9 = new Producto("chocolatada",100);
	Producto p10 = new Producto("chocolatada",100);
	Producto p11 = new Producto("chocolatada",100);
	Producto p12 = new Producto("chocolatada",100);
	Pedido pedido1 = new PedidoPremium();
	pedido1.agregarProducto(p1);
	pedido1.agregarProducto(p2);
	pedido1.agregarProducto(p3);
	pedido1.agregarProducto(p4);
	pedido1.agregarProducto(p5);
	pedido1.agregarProducto(p6);
	pedido1.agregarProducto(p7);
	pedido1.agregarProducto(p8);
	pedido1.agregarProducto(p9);
	pedido1.agregarProducto(p10);
	pedido1.agregarProducto(p11);
	pedido1.agregarProducto(p12);
	System.out.println(pedido1.comision());
	Cadete c1 = new Cadete();
	c1.agregarPedido(pedido1);
	System.out.println(c1.comisiones());
}
}
