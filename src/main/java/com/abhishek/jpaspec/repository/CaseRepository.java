package com.abhishek.jpaspec.repository;

import com.abhishek.jpaspec.entity.Case;
import com.abhishek.jpaspec.spec.CaseSpecification;
import com.abhishekjpaspec.criteria.SearchCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long>, JpaSpecificationExecutor<Case> {

}
