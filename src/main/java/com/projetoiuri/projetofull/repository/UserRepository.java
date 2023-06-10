package com.projetoiuri.projetofull.repository;

import com.projetoiuri.projetofull.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
