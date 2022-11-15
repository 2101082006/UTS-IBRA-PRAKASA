/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.peminjaman.entity;

import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LENOVO
 */
public class Peminjaman {
    @Id
    @GenerateValue(strategy = GenerationType.AUTO)
    private Long peminjamanId;
    private Long anggotaId;
}
