/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import login.LoginDao;
import org.primefaces.context.RequestContext;
import util.MyUtil;

/**
 *
 * @author Cristian
 */
@Named(value = "loginBean")
@SessionScoped
public class loginBean implements Serializable {

    private String usuario;
    private String password;
    private String perfil;
    
    
    public loginBean() {
        
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    public void login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg;
        boolean loggedIn;
        String ruta = "";

        
        this.perfil = LoginDao.validate(this.usuario, this.password);
        
        if (this.perfil != null) {
            loggedIn = true;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("perfil", this.perfil);
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", this.usuario);
            ruta = MyUtil.basepathlogin() + "/home.xhtml";
        } else {
            loggedIn = false;
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Usuario y/o contraseña incorrecto");
            this.usuario = "";
            this.password = "";
            this.perfil = null;
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("loggedIn", loggedIn);
        context.addCallbackParam("ruta", ruta);
    }
    public void logout()
    {
        String ruta = MyUtil.basepathlogin()+"login.xhtml";
        RequestContext context = RequestContext.getCurrentInstance();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
        session.invalidate();
        
        context.addCallbackParam("loggetOut", true);
        context.addCallbackParam("ruta", ruta);
    }
}
