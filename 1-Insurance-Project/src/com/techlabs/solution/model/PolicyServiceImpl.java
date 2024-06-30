package com.techlabs.solution.model;

import java.util.ArrayList;
import java.util.List;

public class PolicyServiceImpl implements PolicyService {
    private List<InsurancePlan> plans = new ArrayList<>();

    @Override
    public void addPlan(InsurancePlan plan) {
        plans.add(plan);
    }

    @Override
    public List<InsurancePlan> getPlans() {
        return plans;
    }
}

