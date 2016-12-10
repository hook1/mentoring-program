package com.sluka.taras.repositories;

import com.sluka.taras.common.model.Level;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "levelRepository")
public interface LevelRepository extends JpaRepository<Level, Long> {

}
