package com.projetoiuri.projetofull.repository;

import com.projetoiuri.projetofull.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
