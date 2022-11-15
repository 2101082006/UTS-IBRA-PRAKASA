/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.penjualan.service;

import com.ibra.penjualan.VO.Pelanggan;
import com.ibra.penjualan.VO.ResponseTemplateVO;
import com.ibra.penjualan.entity.Penjualan;
import com.ibra.penjualan.repository.PenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author LENOVO
 */
@Service
public class PenjualanService {
    @Autowired
    private PenjualanRepository penjualanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Penjualan savePenjualan(Penjualan penjualan){
        return penjualanRepository.save(penjualan);
    }
    
    public ResponseTemplateVO getPenjualan(Long penjualanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Penjualan penjualan = penjualanRepository.findByPenjualanId(penjualanId);
        
        Pelanggan pelanggan = restTemplate.getForObject("http://localhost:8005/pelanggan/" 
                + penjualan.getPenjualanId(), Pelanggan.class);
        vo.setPenjualan(penjualan);
        vo.setPelanggan(pelanggan);
        return vo;
    }
    

    public Penjualan findPenjualanById(Long penjualanId) {
        return penjualanRepository.findByPenjualanId(penjualanId);
    }
}
