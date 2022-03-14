package com.nttdata.demoweb.service;

import java.util.List;

import com.nttdata.demoweb.repository.entity.Empleado;

public interface EmpleadoService {
	public void registrar(String nombre);
	public List<Empleado> listar();
	public List<Empleado> listarFiltroNombre(String cad);
	public List<Empleado> listarConJPA(Integer pId, String contiene);
	public List<Empleado> listarCuyoNombreEs(String nombre);
	public Empleado inserta(Empleado emp);
	

}
