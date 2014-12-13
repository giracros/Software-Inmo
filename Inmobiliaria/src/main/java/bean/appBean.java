/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import util.MyUtil;

/**
 *
 * @author Daniel Fuentes
 */
@ManagedBean
@ApplicationScoped
public class appBean {

    /**
     * Creates a new instance of appBean
     */
    public appBean() {
    }

    public String getBaseUrl() {
        return MyUtil.baseurl();
    }
    
     public String getBasePath() {
        return MyUtil.basepath();
    }
}






