package com.example.fouillearcho.Repository;

import com.example.fouillearcho.Model.Equipe;
import com.example.fouillearcho.Model.EquipeParcelleKey;
import com.example.fouillearcho.Model.Fouille;
import com.example.fouillearcho.Model.Parcelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface FouilleDao extends JpaRepository<Fouille, EquipeParcelleKey> {
	@Query("select f.equipe from fouille f where f.parcelle = ?1")
	List<Equipe> findEquipeByParcelle(Parcelle parcelle);

	@Query("select f.equipe from fouille f where f.parcelle = ?1 and f.date = ?2")
	List<Equipe> findEquipeByParcelleDate(Parcelle parcelle, Date date);
}
