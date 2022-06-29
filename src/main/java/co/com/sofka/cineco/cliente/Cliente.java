package co.com.sofka.cineco.cliente;

import co.com.sofka.cineco.compra.events.AsientoAgregado;
import co.com.sofka.cineco.cliente.events.ClienteCreado;
import co.com.sofka.cineco.cliente.events.NombreCambiado;
import co.com.sofka.cineco.compra.events.PeliculaAgregada;
import co.com.sofka.cineco.cliente.values.*;
import co.com.sofka.cineco.pelicula.values.PeliculaId;
import co.com.sofka.cineco.pelicula.values.Sinopsis;
import co.com.sofka.cineco.sala.values.AsientoId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Cliente extends AggregateEvent<IdentificacionCliente> {

    protected Nombre nombre;
    protected Email email;
    protected Domicilio domicilio;
    protected FechaCumplenos fechaCumplenos;

    public Cliente(IdentificacionCliente entityId, Nombre nombre,  Email email) {
        super(entityId);
        appendChange(new ClienteCreado(nombre, email)).apply();
    }

    /**
     * Pregutnar en que casos se puede hacer así?
     *
     * @param email
     */
    public void actualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public void actualizarDomicilio(Domicilio domicilio){
        this.domicilio = Objects.requireNonNull(domicilio);
    }


    public void cambiarNombre(IdentificacionCliente entityId,Nombre nombre){
        appendChange(new NombreCambiado(entityId,nombre)).apply();
    }


    public Nombre nombre() {
        return nombre;
    }

    public Email email() {
        return email;
    }

    public Domicilio domicilio() {
        return domicilio;
    }

    public FechaCumplenos fechaCumplenos() {
        return fechaCumplenos;
    }


}
