package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TInmueble;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-12T02:43:42")
@StaticMetamodel(TDisponibilidad.class)
public class TDisponibilidad_ { 

    public static volatile SingularAttribute<TDisponibilidad, String> descripcion;
    public static volatile SingularAttribute<TDisponibilidad, Integer> idDisponibilidad;
    public static volatile CollectionAttribute<TDisponibilidad, TInmueble> tInmuebleCollection;

}