/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Nunes Wessner
 */
public class Exercício1 {
     public  Exercício1(ArrayList lista) {
        float total = 0;
        String retorno = "\"Remessa gerada:";
        String texto = " cujo valor é R$ ";
        for (int i = 0; i < lista.size(); i++) {
            total += (float) lista.get(i);
            if (i == (lista.size()-1)) {
                retorno = retorno.substring(0, retorno.length()-1);
                retorno += " e " + (i+1) + texto + lista.get(i) + ".";
            }else{
                retorno += " " + (i+1) + texto + lista.get(i) + ",";
            }
        }
        retorno += " Total = "+ total + ".\"";
         System.out.println(retorno);
    }
}
