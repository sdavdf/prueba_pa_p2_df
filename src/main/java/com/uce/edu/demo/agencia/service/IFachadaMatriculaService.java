package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

public interface IFachadaMatriculaService {
	
	public BigDecimal calcularValorMatricula(String placa);
	
	public void matricularVehiculo(String cedulaPropietario, String placa);

}
