package com.uce.edu.demo.agencia.repository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{
	
	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado un vehículo en la base: "+v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado un vehículo en la base: ");
		Vehiculo v = new Vehiculo();
		v.setMarca("Audi");
		v.setModelo("2019");
		v.setPlaca("HCT");
		v.setTipo("L");
		v.setPrecio(new BigDecimal(2000));
		return v;
	}

	@Override
	public void insetarMatricula(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado un vehículo en la base: "+v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado un vehículo en la base de placa : "+ placa);
	}

}
