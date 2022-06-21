package com.uce.edu.demo.agencia.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el propietario en la base: "+ p);
		
	}

	@Override
	public Propietario buscar(String apellido) {
		System.out.println("Se ha buscado al siguiente propietario: ");
		Propietario p = new Propietario();
		p.setNombre("Juan");
		p.setNombre("Castañeda");
		p.setCedula("0401754601");
		return p;
		
	}

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el propietario en la base: "+ p);
	}

	@Override
	public void eliminar(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario en la base: "+ apellido);
	}

	

}
