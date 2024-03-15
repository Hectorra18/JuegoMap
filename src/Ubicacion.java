import java.util.HashMap;
import java.util.Map;

public class Ubicacion {

private int id;
private String descripcion;
public Map<String,Integer> mapa;

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.mapa= new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getMapa() {
        return mapa;
    }

public void addExit(String direccion, int idUbicacion) {
    mapa.put(direccion, idUbicacion);

    }


}
