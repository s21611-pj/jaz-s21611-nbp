package com.example.jazs21611nbp.repository;


import com.example.jazs21611nbp.model.NbpResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NbpRepository extends JpaRepository<NbpResponse, Long> {
}

