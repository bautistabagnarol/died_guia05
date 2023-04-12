package died.guia05.ejercicio02;

import java.time.LocalDate;

public class Tramite implements Comisionable {
	private String descripcion;
	private String domicilio;
	private LocalDate horaArealizarElTramite;
	private LocalDate fechaRealizacion;

	public Tramite(String descripcion,String domicilio) {
		this.descripcion=descripcion;
		this.domicilio=domicilio;
	}
	
@Override
public  double comision(){
	return 20;
	}

public LocalDate getFechaRealizacion() {
	return fechaRealizacion;
}

public void setFechaRealizacion(LocalDate fechaRealizacion) {
	this.fechaRealizacion = fechaRealizacion;
}

}
