package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("liviano")
public class VehiculoLivianoImpl implements IMatriculaVehiculoService{

	@Override
	public BigDecimal calcularValorMatricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.14));
		
		BigDecimal limite = new BigDecimal(2000);
		
//		if(valorMatricula. limite) {
//			
//		}
		
		return valorMatricula;
	}



}
