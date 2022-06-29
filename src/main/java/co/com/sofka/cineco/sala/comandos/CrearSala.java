package co.com.sofka.cineco.sala.comandos;

import co.com.sofka.cineco.sala.values.SalaId;
import co.com.sofka.cineco.sala.values.TipoSala;

public class CrearSala {

    private final SalaId entityId;
    private final TipoSala tipoSala;

    public CrearSala(SalaId entityId, TipoSala tipoSala){
        this.entityId = entityId;
        this.tipoSala = tipoSala;
    }

    public SalaId getEntityId() {
        return entityId;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }
}
