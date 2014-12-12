package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TInmueble;
import com.lenticulares.inmobiliaria.TZona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T21:00:29")
@StaticMetamodel(TBarrio.class)
public class TBarrio_ { 

    public static volatile SingularAttribute<TBarrio, String> descripcion;
    public static volatile SingularAttribute<TBarrio, Integer> idBarrio;
    public static volatile SingularAttribute<TBarrio, TZona> idZona;
    public static volatile CollectionAttribute<TBarrio, TInmueble> tInmuebleCollection;

}