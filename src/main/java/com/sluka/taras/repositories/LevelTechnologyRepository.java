package com.sluka.taras.repositories;

import com.sluka.taras.common.model.LevelTechnology;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "levelTechnologyRepository")
public interface LevelTechnologyRepository extends JpaRepository<LevelTechnology, Long> {

}
