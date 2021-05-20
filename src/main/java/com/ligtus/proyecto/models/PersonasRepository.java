package com.ligtus.proyecto.models;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonasRepository extends CrudRepository<personas, Long> {
}
