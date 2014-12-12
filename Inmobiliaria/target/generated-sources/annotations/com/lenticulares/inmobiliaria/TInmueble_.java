package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TBarrio;
import com.lenticulares.inmobiliaria.TDisponibilidad;
import com.lenticulares.inmobiliaria.TTipoinmueble;
import com.lenticulares.inmobiliaria.TUsuarios;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T21:00:29")
@StaticMetamodel(TInmueble.class)
public class TInmueble_ { 

    public static volatile SingularAttribute<TInmueble, Integer> idInmueble;
    public static volatile SingularAttribute<TInmueble, String> direccionInmueble;
    public static volatile SingularAttribute<TInmueble, TUsuarios> clienteIdUsuario;
    public static volatile SingularAttribute<TInmueble, BigDecimal> valorInmueble;
    public static volatile SingularAttribute<TInmueble, String> nivelPiso;
    public static volatile SingularAttribute<TInmueble, String> zonasComunes;
    public static volatile SingularAttribute<TInmueble, TDisponibilidad> idDisponibilidad;
    public static volatile SingularAttribute<TInmueble, String> noAlcobas;
    public static volatile SingularAttribute<TInmueble, TUsuarios> empleadoIdUsuario;
    public static volatile SingularAttribute<TInmueble, String> noPatios;
    public static volatile SingularAttribute<TInmueble, String> espacios;
    public static volatile SingularAttribute<TInmueble, String> noGarajes;
    public static volatile SingularAttribute<TInmueble, String> tipoCocina;
    public static volatile SingularAttribute<TInmueble, TBarrio> idBarrio;
    public static volatile SingularAttribute<TInmueble, String> observaciones;
    public static volatile SingularAttribute<TInmueble, String> estrato;
    public static volatile SingularAttribute<TInmueble, String> noBaños;
    public static volatile SingularAttribute<TInmueble, TTipoinmueble> idTipoInmueble;
    public static volatile SingularAttribute<TInmueble, String> codigoInmueble;
    public static volatile SingularAttribute<TInmueble, String> areaMt2;

}