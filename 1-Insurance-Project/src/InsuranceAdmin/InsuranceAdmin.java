package InsuranceAdmin;

import com.techlabs.solution.model.AgentService;
import com.techlabs.solution.model.Commission;
import com.techlabs.solution.model.CommissionService;
import com.techlabs.solution.model.Employee;
import com.techlabs.solution.model.EmployeeService;
import com.techlabs.solution.model.InsurancePlan;
import com.techlabs.solution.model.PolicyService;
import com.techlabs.solution.model.WithdrawalRequest;

public class InsuranceAdmin {
    private PolicyService policyService;
    private CommissionService commissionService;
    private EmployeeService employeeService;
    private AgentService agentService;

    public InsuranceAdmin(PolicyService policyService, CommissionService commissionService, EmployeeService employeeService, AgentService agentService) {
        this.policyService = policyService;
        this.commissionService = commissionService;
        this.employeeService = employeeService;
        this.agentService = agentService;
    }

    public void addInsurancePlan(InsurancePlan plan) {
        policyService.addPlan(plan);
    }

    public void setCommission(Commission commission) {
        commissionService.setCommission(commission);
    }

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public void approveWithdrawal(WithdrawalRequest request) {
        commissionService.approveWithdrawal(request);
    }
}

