package com.abhishek.jpaspec.service;

import com.abhishek.jpaspec.entity.Case;
import com.abhishek.jpaspec.repository.CaseRepository;
import com.abhishek.jpaspec.spec.CaseSpecification;
import com.abhishekjpaspec.criteria.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService {

    @Autowired
    private CaseRepository caseRepository;

    public Case saveCase(Case caseEntity) {
        return caseRepository.save(caseEntity);
    }

    public List<Case> getCaseList(SearchCriteria searchCriteria) {
        return caseRepository.findAll(new CaseSpecification(searchCriteria));
    }

    public List<Case> getCaseList() {
        return caseRepository.findAll();
    }
}
