package com.sluka.taras.repositories;

import com.sluka.taras.common.model.LectureEvent;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by taras on 26.11.2016.
 */
@Repository
@Qualifier(value = "lectureEventRepository")
public interface LectureEventRepository extends JpaRepository<LectureEvent, Long> {

}
