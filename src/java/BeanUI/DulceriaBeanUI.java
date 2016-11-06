/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BeanUI;

import BeanHelper.DulceriaHelper;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Edgar
 */
@ManagedBean
@ViewScoped
public class DulceriaBeanUI implements Serializable {

    /**
     * Creates a new instance of DulceriaBeanUI
     */
   private DulceriaHelper helper;

    public DulceriaHelper getHelper() {
        return helper;
    }

    public void setHelper(DulceriaHelper helper) {
        this.helper = helper;
    }
   
    public DulceriaBeanUI() {
    }
    
}
