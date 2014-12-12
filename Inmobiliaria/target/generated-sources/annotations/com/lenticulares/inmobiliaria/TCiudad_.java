package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TDepartamento;
import com.lenticulares.inmobiliaria.TZona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T21:00:29")
@StaticMetamodel(TCiudad.class)
public class TCiudad_ { 

    public static volatile SingularAttribute<TCiudad, String> descripcion;
    public static volatile SingularAttribute<TCiudad, TDepartamento> idDepartamento;
    public static volatile CollectionAttribute<TCiudad, TZona> tZonaCollection;
    public static volatile SingularAttribute<TCiudad, Integer> idCiudad;

}