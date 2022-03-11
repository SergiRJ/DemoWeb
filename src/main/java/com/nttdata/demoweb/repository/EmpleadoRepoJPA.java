package com.nttdata.demoweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nttdata.demoweb.repository.entity.Empleado;

@Repository
public interface EmpleadoRepoJPA extends JpaRepository<Empleado, Integer>, EmpleadoRepo{

	List<Empleado> findByIdGreaterThanAndNombreLike(Integer pId, String contiene);
	
	@Query(value="select * from empleado WHERE nombre=?1", nativeQuery=true)
	public List<Empleado> listarCuyoNombreEs(String nombre);
}
