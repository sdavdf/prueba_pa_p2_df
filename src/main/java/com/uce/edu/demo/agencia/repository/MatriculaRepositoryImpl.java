package com.uce.edu.demo.agencia.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se creo la matricula: " + m);
	}

}
