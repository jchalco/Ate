/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bc;

import be.DetalleUbicacionFisicaProducto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author argos
 */
@Stateless
public class DetalleUbicacionFisicaProductoFacade extends AbstractFacade<DetalleUbicacionFisicaProducto> implements DetalleUbicacionFisicaProductoFacadeLocal {
    @PersistenceContext(unitName = "sistema-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleUbicacionFisicaProductoFacade() {
        super(DetalleUbicacionFisicaProducto.class);
    }

}
