package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TInmueble;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-12T02:29:51")
@StaticMetamodel(TTipoinmueble.class)
public class TTipoinmueble_ { 

    public static volatile SingularAttribute<TTipoinmueble, String> descripcion;
    public static volatile SingularAttribute<TTipoinmueble, Integer> idTipoInmueble;
    public static volatile CollectionAttribute<TTipoinmueble, TInmueble> tInmuebleCollection;

}