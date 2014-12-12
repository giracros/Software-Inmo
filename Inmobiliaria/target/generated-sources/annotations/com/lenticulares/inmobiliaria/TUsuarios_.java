package com.lenticulares.inmobiliaria;

import com.lenticulares.inmobiliaria.TInmueble;
import com.lenticulares.inmobiliaria.TRol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-12T02:29:51")
@StaticMetamodel(TUsuarios.class)
public class TUsuarios_ { 

    public static volatile SingularAttribute<TUsuarios, String> apellidos;
    public static volatile SingularAttribute<TUsuarios, String> cedula;
    public static volatile SingularAttribute<TUsuarios, Integer> idUsuario;
    public static volatile SingularAttribute<TUsuarios, String> direccion;
    public static volatile CollectionAttribute<TUsuarios, TInmueble> tInmuebleCollection1;
    public static volatile SingularAttribute<TUsuarios, String> nombres;
    public static volatile SingularAttribute<TUsuarios, String> telefonoFijo;
    public static volatile SingularAttribute<TUsuarios, String> password;
    public static volatile CollectionAttribute<TUsuarios, TRol> tRolCollection;
    public static volatile SingularAttribute<TUsuarios, String> celular;
    public static volatile SingularAttribute<TUsuarios, String> tipoUsuario;
    public static volatile SingularAttribute<TUsuarios, String> email;
    public static volatile CollectionAttribute<TUsuarios, TInmueble> tInmuebleCollection;

}