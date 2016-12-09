package com.sluka.taras.repositories;

import com.sluka.taras.common.model.Category;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by taras on 08.11.2016.
 */
@Repository
@Qualifier(value = "categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
