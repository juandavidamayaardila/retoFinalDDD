package co.com.sofka.cineco.tarjetacineco;

import co.com.sofka.cineco.tarjetacineco.events.ActualizarEstadoTarjeta;
import co.com.sofka.cineco.tarjetacineco.events.TarjetaCinecoCreada;
import co.com.sofka.cineco.tarjetacineco.values.Descripcion;
import co.com.sofka.cineco.tarjetacineco.values.Estado;
import co.com.sofka.cineco.tarjetacineco.values.TarjetaCinecoId;
import co.com.sofka.domain.generic.AggregateEvent;

public class TarjetaCineco extends AggregateEvent<TarjetaCinecoId> {

    protected Descripcion descripcion;
    protected Estado estado;


    public TarjetaCineco(TarjetaCinecoId entityId, Descripcion descripcion, Estado estado) {
        super(entityId);
        appendChange(new TarjetaCinecoCreada(entityId, descripcion, estado)).apply();
    }

    public void actualizarEstadoTarjeta(TarjetaCinecoId entityId,  Estado estado){
        appendChange(new ActualizarEstadoTarjeta(entityId, estado)).apply();
    }
}
