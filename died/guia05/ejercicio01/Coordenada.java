package died.guia05.ejercicio01;

public class Coordenada {
	private double latitud, longitud;
	private final double RADIO_TIERRA_KM = 6378.137;
	private final double UN_METRO_EN_GRADOS = (1 / ((2 * Math.PI / 360) * RADIO_TIERRA_KM)) / 1000;

	public Coordenada() {

		this(0, 0);
	}

	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = new Coordenada();
		return (Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud))
				&& (Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud));
	}

	@Override
	public String toString() {
		return "Coordenada [latitud=" + latitud + ", longitud=" + longitud + "]";
	}

	public void sumarMts(int mtsLt, int mtsLn) {
		double latitudOriginal = latitud;
		latitud = latitud + (mtsLt * UN_METRO_EN_GRADOS);
		longitud = longitud + (mtsLn * UN_METRO_EN_GRADOS) / Math.cos(latitudOriginal * (Math.PI / 180));
	}

}
