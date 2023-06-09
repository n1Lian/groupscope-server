package org.groupscope.dao.repositories;

import org.groupscope.entity.Learner;
import org.groupscope.entity.LearningRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerRepository extends CrudRepository<Learner, Long> {

}
