/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Aluno
 */
public enum Sexo {  

    MASCULINO('M', "Masculino"), 
    FEMININO('F', "Feminino");  

    private char curto;  
    private String completo;  

    private Sexo(char curto, String completo) {  
        this.curto = curto;  
        this.completo = completo;  
    }  

    @Override  
    public String toString() {  
        return completo;  
    }  

    public char toChar() {  
        return curto;  
    }  

    public static Sexo getSexo(char c) {  
        for (Sexo s : Sexo.values()) {  
            if (s.toChar() == Character.toLowerCase(c)  
                    || s.toChar() == Character.toUpperCase(c)) {  
                return s;  
            }  
        }  
        throw new IllegalArgumentException("O sexo não existe.");  
    }  

    public static Sexo getSexo(String sexo) {  
        for (Sexo s : Sexo.values()) {  
            if (s.toString().equalsIgnoreCase(sexo)) {  
                return s;  
            }  
        }  
        throw new IllegalArgumentException("O sexo não existe.");
   
   
    }
}
