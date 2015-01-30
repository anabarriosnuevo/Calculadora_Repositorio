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
public class OperacionesCalculadora {
    
    public double operacionB(OperacionEnum op, double ope1, double ope2) {
        double resultado= 0d;
        if (op != null){
            String oper = op.getValue();
            switch(oper){
                case "S":
                    resultado = ope1 + ope2;
                    break;
                case "R":
                    resultado = ope1 - ope2;
                    break;
                case "M":
                    resultado = ope1 * ope2;
                    break;
                case "D":
                    resultado = ope1 / ope2;
                    break;
                case "P":
                    resultado = Math.pow(ope1, ope2);
                    break;
            }
            
        }
        return resultado;
    }
    
}

