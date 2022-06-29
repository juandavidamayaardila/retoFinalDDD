package co.com.sofka.cineco.compra.events;

import co.com.sofka.cineco.sala.values.AsientoId;
import co.com.sofka.domain.generic.DomainEvent;

public class AsientoAgregado extends DomainEvent {

    private final AsientoId entityId;
    public AsientoAgregado(AsientoId entityId) {

        super("sofka.cliente.asientoagregado");
        this.entityId = entityId;
    }

    public AsientoId getEntityId() {
        return entityId;
    }
}
