package co.com.sofka.cineco.cliente.values;

import co.com.sofka.cineco.beneficio.values.BeneficioId;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class IdentificacionCliente extends Identity {

    public IdentificacionCliente(){}
    private IdentificacionCliente(String id){
        super(id);
    }

    public static IdentificacionCliente of(String id){
        return new IdentificacionCliente(id);
    }

}
