package com.abhishek.jpaspec.controller;


import com.abhishek.jpaspec.entity.Case;
import com.abhishek.jpaspec.service.CaseService;
import com.abhishekjpaspec.criteria.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CaseController {

    @Autowired
    private CaseService caseService;

    @PostMapping(path = "/cases")
    public ResponseEntity<Case> saveCase(@RequestBody Case caseEntity) {
        return new ResponseEntity<Case>(caseService.saveCase(caseEntity), HttpStatus.OK);
    }

    @GetMapping(path = "/cases/list")
    public ResponseEntity<List<Case>> getCase(@RequestBody Optional<SearchCriteria> searchCriteria) {
        if(searchCriteria.isPresent())
            return new ResponseEntity<List<Case>>(caseService.getCaseList(searchCriteria.get()), HttpStatus.OK);
        return new ResponseEntity<>(caseService.getCaseList(), HttpStatus.OK);
    }

}
