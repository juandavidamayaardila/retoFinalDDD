package co.com.sofka.cineco.sala;

import co.com.sofka.cineco.sala.events.ActualizarTipoSala;
import co.com.sofka.cineco.sala.events.SalaCreada;
import co.com.sofka.cineco.sala.values.SalaId;
import co.com.sofka.cineco.sala.values.TipoSala;
import co.com.sofka.cineco.sala.values.Zona;
import co.com.sofka.domain.generic.AggregateEvent;

public class Sala extends AggregateEvent<SalaId> {
    protected TipoSala tipoSala;
    protected Zona zona;

    public Sala(SalaId entityId, TipoSala tipoSala) {

        super(entityId);
        appendChange(new SalaCreada(tipoSala)).apply();
    }

    public void actualizarTipoSala(SalaId entityId, TipoSala tipoSala){
        appendChange(new ActualizarTipoSala(entityId, tipoSala )).apply();
    }
}
