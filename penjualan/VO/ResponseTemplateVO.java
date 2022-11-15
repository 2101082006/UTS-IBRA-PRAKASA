/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.penjualan.VO;

import com.ibra.penjualan.entity.Penjualan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author LENOVO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
   private Pelanggan pelanggan;
   private Penjualan penjualan;

    
}
