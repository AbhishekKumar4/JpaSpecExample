package com.abhishek.jpaspec.spec;

import com.abhishek.jpaspec.entity.Case;
import com.abhishekjpaspec.criteria.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class CaseSpecification implements Specification<Case> {

    private SearchCriteria filter;

     public CaseSpecification(SearchCriteria filter) {
        super();
        this.filter =  filter;
     }

    @Override
    public Predicate toPredicate(Root<Case> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        //Predicate p = criteriaBuilder.disjunction();
        List<Predicate> predicates = new ArrayList<>();
        if(filter.getCaseStatus() != null) {
            Expression<List<Long>> epression = root.get("caseStatus");
            predicates.add(epression.in(filter.getCaseStatus()));
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}
