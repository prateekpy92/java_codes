package com.techlabs.solution.model;

import java.util.HashMap;
import java.util.Map;

public class CommissionServiceImpl implements CommissionService {
    private Map<Agent, Commission> commissions = new HashMap<>();

    @Override
    public void setCommission(Commission commission) {
        commissions.put(commission.getAgent(), commission);
    }

    @Override
    public void approveWithdrawal(WithdrawalRequest request) {
        // Business logic to approve withdrawal
    }

    @Override
    public Commission getCommission(Agent agent) {
        return commissions.get(agent);
    }
}

