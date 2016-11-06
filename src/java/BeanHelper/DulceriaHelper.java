/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BeanHelper;

import BaseDao.basedao;
import Modelo.Dulces;
import java.util.List;

/**
 *
 * @author Edgar
 */
public class DulceriaHelper {
    private Dulces dulce;
    private basedao dao;
    private List<Dulces> listadulces;

    public Dulces getDulce() {
        return dulce;
    }

    public void setDulce(Dulces dulce) {
        this.dulce = dulce;
    }

    public List<Dulces> getListadulces() {
        return listadulces;
    }

    public void setListadulces(List<Dulces> listadulces) {
        this.listadulces = listadulces;
    }

    public basedao getDao() {
        return dao;
    }

    public void setDao(basedao dao) {
        this.dao = dao;
    }
    
    public void mostrarDulces(){
        String query="from Dulces";
        listadulces= dao.executeQuery(query);
        System.out.println("Entre");
        for(int x=0;x<listadulces.size();x++){
            System.out.println("Lista Dulces :"+listadulces.get(x).getIdDulce());
        }
    }
}
