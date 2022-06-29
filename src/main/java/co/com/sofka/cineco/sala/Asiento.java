package co.com.sofka.cineco.sala;

import co.com.sofka.cineco.sala.values.AsientoId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Asiento extends AggregateEvent<AsientoId> {
    public Asiento(AsientoId entityId) {
        super(entityId);
    }
}
