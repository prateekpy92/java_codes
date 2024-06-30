package com.techlabs.solution.model;

import java.util.List;

public interface CommissionService {
    void setCommission(Commission commission);
    void approveWithdrawal(WithdrawalRequest request);
    Commission getCommission(Agent agent);
}
