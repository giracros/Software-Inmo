package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TBarrio;
import com.lenticulares.inmobiliaria.TCiudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T21:00:29")
@StaticMetamodel(TZona.class)
public class TZona_ { 

    public static volatile SingularAttribute<TZona, String> descripcion;
    public static volatile CollectionAttribute<TZona, TBarrio> tBarrioCollection;
    public static volatile SingularAttribute<TZona, Integer> idZona;
    public static volatile SingularAttribute<TZona, TCiudad> idCiudad;

}