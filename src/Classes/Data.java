/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDateTime;

/**
 *
 * @author iagoi
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;

    public Data() {
        this.dia = -1;
        this.mes = -1;
        this.ano = -1;
        this.hora = -1;
        this.minuto = -1;
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = -1;
        this.minuto = -1;
    }
    
    public Data(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public void now(){
        LocalDateTime now = LocalDateTime.now();  
        this.dia = now.getDayOfMonth();
        this.mes = now.getMonthValue();
        this.ano = now.getYear();
        this.hora = now.getHour();
        this.minuto = now.getMinute();
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano + (hora!=-1?(", " + hora +"h" + (minuto!=-1?(":" + minuto) :' ')):" ");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Data)) return false;
     else{
         Data comp = (Data) obj;
         return this.dia == comp.getDia() &&
           this.mes == comp.getMes() &&
           this.ano == comp.getAno() &&
           this.hora == comp.getHora() &&
           this.minuto == comp.getMinuto();
     }
    }
    
    
    
    
    
}
