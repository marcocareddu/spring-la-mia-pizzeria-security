package org.java.spring.repo;

import org.java.spring.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Ingredient, Integer>{

}
