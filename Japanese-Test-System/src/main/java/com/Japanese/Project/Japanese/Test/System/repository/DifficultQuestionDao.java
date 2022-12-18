package com.Japanese.Project.Japanese.Test.System.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Japanese.Project.Japanese.Test.System.entity.DifficultQuestion;

@Transactional
@Repository
public interface DifficultQuestionDao extends JpaRepository<DifficultQuestion, UUID>{

}
