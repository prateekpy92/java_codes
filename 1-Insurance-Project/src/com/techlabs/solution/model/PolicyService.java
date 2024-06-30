package com.techlabs.solution.model;

import java.util.List;

public interface PolicyService {
    void addPlan(InsurancePlan plan);
    List<InsurancePlan> getPlans();
}
