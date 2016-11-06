/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDao;

import java.util.List;


/**
 *
 * @author Edgar
 * @param <T>
 */
public class basedao <T>  {

    private Class<T> tipo;

    public basedao() {

    }
    
     public basedao(Class<T> tipo) {
        this.tipo = tipo;
        System.out.println(" Se crea el bean con la clae: " + tipo.getName());
    }

    public Class<T> getTipo() {
        return tipo;
    }

    public void setTipo(Class<T> tipo) {
        this.tipo = tipo;
    }
    
    public List<T> executeQuery(String query) {
        List<T> result = null;
        HibernateUtil.getSession();
        HibernateUtil.beingTransaccion();

        try {
//            result = (List<T>) HibernateUtil.getSession().createQuery("select a from "+getTipo().getCanonicalName()+" a where a."+campo+
//                    "="+criterio).list();
            
            result = (List<T>) HibernateUtil.getSession().createQuery(query).list();
            
            if (result == null) {
                System.out.println("nulo");
            }
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return result;
    }
    
    public List<T> executeSQL(String query) {
List<T> result = null;
        HibernateUtil.getSession();
        HibernateUtil.beingTransaccion();

        try {
//            result = (List<T>) HibernateUtil.getSession().createQuery("select a from "+getTipo().getCanonicalName()+" a where a."+campo+
//                    "="+criterio).list();
            
            result = (List<T>) HibernateUtil.getSession().createSQLQuery(query).list();
            
            if (result == null) {
                System.out.println("nulo");
            }
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return result;
    }
    
    public List<T> findAll() {
        List<T> result = null;
        HibernateUtil.getSession();
        HibernateUtil.beingTransaccion();
        try {
            result = (List<T>) HibernateUtil.getSession().createQuery("from " + tipo.getName()).list();
            if (result == null) {
                System.out.println("nulo");
            }
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return result;
    }
    
}
