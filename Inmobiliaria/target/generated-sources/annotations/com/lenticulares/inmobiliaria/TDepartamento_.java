package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TCiudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T21:00:29")
@StaticMetamodel(TDepartamento.class)
public class TDepartamento_ { 

    public static volatile SingularAttribute<TDepartamento, String> descripcion;
    public static volatile SingularAttribute<TDepartamento, Integer> idDepartamento;
    public static volatile CollectionAttribute<TDepartamento, TCiudad> tCiudadCollection;

}