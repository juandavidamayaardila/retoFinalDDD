package co.com.sofka.cineco.pelicula.comandos;

import co.com.sofka.cineco.cliente.values.Nombre;
import co.com.sofka.cineco.pelicula.Pelicula;
import co.com.sofka.cineco.pelicula.values.PeliculaId;
import co.com.sofka.cineco.pelicula.values.Sinopsis;

public class CrearPelicula {

    private final PeliculaId entityId;
    private final Nombre nombre;
    private final Sinopsis sinopsis;

    public CrearPelicula(PeliculaId entityId, Nombre nombre, Sinopsis sinopsis){
        this.entityId = entityId;
        this.nombre = nombre;
        this.sinopsis = sinopsis;
    }

    public PeliculaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Sinopsis getSinopsis() {
        return sinopsis;
    }
}
