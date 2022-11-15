/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.pelanggan.service;

import com.ibra.pelanggan.entity.Pelanggan;
import com.ibra.pelanggan.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class PelangganService {
    @Autowired
    private PelangganRepository pelangganRepository;
    
    public Pelanggan savePelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }
    public Pelanggan findPelangganById(Long pelangganId){
        return pelangganRepository.findByPelangganId(pelangganId);
    }
}
