/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package co.edu.unbosque.calculadora.operaciones;

/**
 *
 * @author Ana Maria
 */
public enum OperacionEnum {
    
    S("S"),
    R("R"),
    M("M"),
    D("D"),
    P("P");
    private final String value;
    
    private OperacionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

