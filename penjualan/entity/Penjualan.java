/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.penjualan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author LENOVO
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Penjualan {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private Long pelangganId;
    private Long penjualanId;
    private String namaBarang;
    private double harga;
    private double jumlah;
    private double diskonPersen;
    private double PPNPersen;
    private double total;
    private double TDiskon;
    private double TPPN;
    private double totalBayar;
    
    public void setTotal(double total){
        this.total=total;
    }
    
    public double getTotal(){
        total = harga*jumlah;
        return total;
    }
    
    public void setTDiskon(double TDiskon){
        this.TDiskon=TDiskon;
    }
    
    public double getTDiskon(){
        TDiskon = diskonPersen*total;
        return TDiskon;
    }
    
    public void setTPPN(double TPPN){
        this.TPPN=TPPN;
    }
    
    public double getTPPN(){
        TPPN = PPNPersen*(total-TDiskon);
        return TPPN;
    }
    
    public void settotalBayar(double totalBayar){
        this.totalBayar=totalBayar;
    }
    
    public double gettotalBayar(){
        totalBayar = total - TDiskon + TPPN;
        return totalBayar;
    }


    
    
}
