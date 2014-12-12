package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T21:00:29")
@StaticMetamodel(TRol.class)
public class TRol_ { 

    public static volatile SingularAttribute<TRol, String> descripcion;
    public static volatile SingularAttribute<TRol, Integer> idRol;
    public static volatile CollectionAttribute<TRol, TUsuarios> tUsuariosCollection;

}