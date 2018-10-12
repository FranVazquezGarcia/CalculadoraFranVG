/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import es.albarregas.exceptions.DivisionPorCeroException;
import java.io.Serializable;

/**
 *
 * @author fjvaz
 */
public class Atributos implements Serializable{
    private double operando1;
    private double operando2;
    private double resultado;
    private String operacion;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) throws DivisionPorCeroException {
         if(Double.isInfinite(resultado)){
              throw new DivisionPorCeroException("No se puede dividir por 0.");
         }
        this.resultado = resultado;
    }

    
    
}
