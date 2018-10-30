/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.kinal.tickets.model;

import javax.persistence.Embeddable;

/**
 *
 * @author armas
 */
@Embeddable//anotaciones
public class DepartamentoPk {
    Long empresaId;
    Long departamentoid;//llave primaria compuesta

    public DepartamentoPk() {
    }

    public Long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
    }

    public Long getDepartamentoid() {
        return departamentoid;
    }

    public void setDepartamentoid(Long departamentoid) {
        this.departamentoid = departamentoid;
    }

    
    
}
