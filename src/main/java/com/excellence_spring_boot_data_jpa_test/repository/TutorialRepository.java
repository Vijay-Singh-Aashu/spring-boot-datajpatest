package com.excellence_spring_boot_data_jpa_test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence_spring_boot_data_jpa_test.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	  List<Tutorial> findByPublished(boolean published);

	  List<Tutorial> findByTitleContaining(String title);
	}
