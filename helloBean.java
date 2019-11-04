/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Named(value = "helloBean")
@SessionScoped
public class helloBean implements Serializable {

    private String nome = "";
    private String programa = "";
    /*private Date data = new Date(System.currentTimeMillis());*/
    private String data = "";
    private boolean mostraNome = false;
    private boolean mostraPrograma = false;
    private boolean mostraData = false;
/*    DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");  
    String strData = ""; */
    private String [] quePrograma = {"-","Tecnologias para Desenvolvimento web","Oficina Certificadora","Outra Disciplina"};

    public String program (Integer qual){
        return quePrograma[qual];
    }
       
    public boolean isMostrarNome(){
        return mostraNome;
    }
    
    public boolean isMostrarPrograma(){
        return mostraPrograma;
    }
    
    public boolean isMostrarData(){
        return mostraData;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public helloBean() {
    }

     public void sayWelcome() {
        if ("".equals(nome)){
            mostraNome = false;
        } else {
            mostraNome = true;
        }

        if (Integer.parseInt(programa) == 0) {
            mostraPrograma = false;
        } else {
            mostraPrograma = true;
        }
        if ("".equals(data)) {
            mostraData = false;
        } else {
            mostraData = true;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final helloBean other = (helloBean) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }


}