package com.faradzhalelov.springboot.repository;

import com.faradzhalelov.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {


}
