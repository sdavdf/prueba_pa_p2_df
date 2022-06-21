package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.modelo.Matricula;
import com.uce.edu.demo.agencia.modelo.Propietario;
import com.uce.edu.demo.agencia.modelo.Vehiculo;
import com.uce.edu.demo.agencia.repository.IMatriculaRepository;
import com.uce.edu.demo.agencia.repository.IPropietarioRepository;
import com.uce.edu.demo.agencia.repository.IVehiculoRepository;

@Service
public class FachadaMatriculaServiceImpl implements IFachadaMatriculaService{

	@Autowired
	@Qualifier("pesado")
	private IMatriculaVehiculoService iMatriculaVehiculoServiceA;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaVehiculoService iMatriculaVehiculoServiceB;
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public BigDecimal calcularValorMatricula(String placa) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = null;
		Vehiculo v = this.iVehiculoRepository.buscar(placa);
		if(v.getTipo().equals("L")) {
			valorMatricula = this.iMatriculaVehiculoServiceA.calcularValorMatricula(v.getPrecio());
		}else {
			valorMatricula = this.iMatriculaVehiculoServiceB.calcularValorMatricula(v.getPrecio());
		}
		
		return valorMatricula;
	}

	@Override
	public void matricularVehiculo(String cedulaPropietario, String placa) {
		// TODO Auto-generated method stub
		
		Propietario p = this.iPropietarioRepository.buscar(cedulaPropietario);
		Vehiculo v = this.iVehiculoRepository.buscar(placa);
		 
		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setValorMatricula(this.calcularValorMatricula(placa));
		m.setPropietario(p);
		m.setVehiculo(v);
		
		this.iMatriculaRepository.actualizar(m);
		
		
	}

}