package died.guia05.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Camino {
	private List<Coordenada> camino = new ArrayList<Coordenada>();

	public void agregar(Coordenada x) {
		this.camino.add(x);
	}

	public void agregar(double lat, double lng) {
		Coordenada nuevaCoordenada = new Coordenada(lat, lng);
		this.agregar(nuevaCoordenada);
	}

	public void agregar(int mtsLt, int mtsLn) {
		Coordenada ultimaCoordenada = camino.isEmpty() ? new Coordenada() : camino.get(camino.size() - 1);
		Coordenada nuevaCoordenada = new Coordenada(ultimaCoordenada.getLatitud(), ultimaCoordenada.getLongitud());
		nuevaCoordenada.sumarMts(mtsLt, mtsLn);
		agregar(nuevaCoordenada);
	}

	public List<Coordenada> buscar(Coordenada no, Coordenada se) {
		List<Coordenada> listCord = new ArrayList<Coordenada>();
		for (Coordenada punto : camino) {
			if ((no.getLatitud() >= punto.getLatitud() && no.getLongitud() <= punto.getLongitud())
					&& ((se.getLatitud() <= punto.getLatitud() && se.getLongitud() >= punto.getLongitud()))) {
				listCord.add(punto);
			}
		}
		return listCord;
	}

	public List<Coordenada> buscar(Coordenada coordenada, int distancia) {

		Coordenada no = new Coordenada(coordenada.getLatitud(), coordenada.getLongitud());
		Coordenada se = new Coordenada(coordenada.getLatitud(), coordenada.getLongitud());

		no.sumarMts(distancia, -distancia);
		se.sumarMts(-distancia, distancia);

		return buscar(no, se);
	}
	
	public List<Coordenada> getCamino() {
		return camino;
	}
	
	
}
