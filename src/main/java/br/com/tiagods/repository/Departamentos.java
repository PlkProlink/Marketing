package br.com.tiagods.repository;

import br.com.tiagods.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Departamentos extends JpaRepository<Departamento, Long> {
    List<Departamento> findAllByOrderByName();
}