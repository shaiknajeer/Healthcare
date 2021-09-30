package com.zensar;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}
