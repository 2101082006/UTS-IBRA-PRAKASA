/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ibra.pelanggan.repository;

import com.ibra.pelanggan.entity.Pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LENOVO
 */
public interface PelangganRepository extends JpaRepository<Pelanggan, Long>{

    public Pelanggan findByPelangganId(Long pelangganId);
    
}
