package com.sluka.taras.repositories;

import com.sluka.taras.common.model.Groups;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by taras on 24.11.2016.
 */
@Repository
public interface GroupsRepository extends JpaRepository<Groups,Long>{

}
