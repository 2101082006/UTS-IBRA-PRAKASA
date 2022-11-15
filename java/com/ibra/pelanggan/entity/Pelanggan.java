/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.pelanggan.entity;

import java.io.Serializable;
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
public class Pelanggan implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long pelangganId;
    private String nama;
    private String alamat;
    
}
