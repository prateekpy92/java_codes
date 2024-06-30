package com.techlabs.solution.test;

import java.util.List;
import java.util.Scanner;

import com.techlabs.solution.model.Agent;
import com.techlabs.solution.model.AgentService;
import com.techlabs.solution.model.AgentServiceImpl;
import com.techlabs.solution.model.Commission;
import com.techlabs.solution.model.CommissionService;
import com.techlabs.solution.model.CommissionServiceImpl;
import com.techlabs.solution.model.Customer;
import com.techlabs.solution.model.CustomerService;
import com.techlabs.solution.model.CustomerServiceImpl;
import com.techlabs.solution.model.Employee;
import com.techlabs.solution.model.EmployeeService;
import com.techlabs.solution.model.EmployeeServiceImpl;
import com.techlabs.solution.model.InsurancePlan;
import com.techlabs.solution.model.PolicyService;
import com.techlabs.solution.model.PolicyServiceImpl;
import com.techlabs.solution.model.WithdrawalRequest;

import InsuranceAdmin.InsuranceAdmin;

import java.util.Scanner;

public class InsuranceDemo {
	 public static void main(String[] args) {
	        PolicyService policyService = new PolicyServiceImpl();
	        CommissionService commissionService = new CommissionServiceImpl();
	        EmployeeService employeeService = new EmployeeServiceImpl();
	        AgentService agentService = new AgentServiceImpl();
	        CustomerService customerService = new CustomerServiceImpl();

	        InsuranceAdmin admin = new InsuranceAdmin(policyService, commissionService, employeeService, agentService);
	        
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Admin Operations");
	            System.out.println("2. Employee Operations");
	            System.out.println("3. Agent Operations");
	            System.out.println("4. Customer Operations");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            
	            switch (choice) {
	                case 1:
	                    handleAdminOperations(admin, scanner);
	                    break;
	                case 2:
	                    handleEmployeeOperations(employeeService, scanner);
	                    break;
	                case 3:
	                    handleAgentOperations(agentService, scanner);
	                    break;
	                case 4:
	                    handleCustomerOperations(customerService, scanner);
	                    break;
	                case 5:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }

	    private static void handleAdminOperations(InsuranceAdmin admin, Scanner scanner) {
	        System.out.println("1. Add Insurance Plan");
	        System.out.println("2. Set Commission");
	        System.out.println("3. Add Employee");
	        System.out.println("4. Approve Withdrawal");
	        System.out.print("Choose an option: ");
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        switch (choice) {
	            case 1:
	                System.out.print("Enter Plan ID: ");
	                String planId = scanner.nextLine();
	                System.out.print("Enter Plan Name: ");
	                String planName = scanner.nextLine();
	                System.out.print("Enter Premium Amount: ");
	                double premiumAmount = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline
	                InsurancePlan plan = new InsurancePlan(planId, planName, premiumAmount);
	                admin.addInsurancePlan(plan);
	                System.out.println("Insurance plan added successfully.");
	                break;
	            case 2:
	                System.out.print("Enter Agent ID: ");
	                String agentId = scanner.nextLine();
	                System.out.print("Enter Commission Amount: ");
	                double commissionAmount = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline
	                Agent agent = new Agent(agentId, "Agent Name"); // Simplified for the example
	                Commission commission = new Commission(agent, commissionAmount);
	                admin.setCommission(commission);
	                System.out.println("Commission set successfully.");
	                break;
	            case 3:
	                System.out.print("Enter Employee ID: ");
	                String employeeId = scanner.nextLine();
	                System.out.print("Enter Employee Name: ");
	                String employeeName = scanner.nextLine();
	                Employee employee = new Employee(employeeId, employeeName);
	                admin.addEmployee(employee);
	                System.out.println("Employee added successfully.");
	                break;
	            case 4:
	                System.out.print("Enter Request ID: ");
	                String requestId = scanner.nextLine();
	                System.out.print("Enter Customer ID: ");
	                String customerId = scanner.nextLine();
	                System.out.print("Enter Withdrawal Amount: ");
	                double amount = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline
	                Customer customer = new Customer(customerId, "Customer Name"); // Simplified for the example
	                WithdrawalRequest request = new WithdrawalRequest(requestId, customer, amount);
	                admin.approveWithdrawal(request);
	                System.out.println("Withdrawal request approved.");
	                break;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }
	    }

	    private static void handleEmployeeOperations(EmployeeService employeeService, Scanner scanner) {
	        System.out.println("1. Add Employee");
	        System.out.println("2. Verify Customer Documents");
	        System.out.print("Choose an option: ");
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        switch (choice) {
	            case 1:
	                System.out.print("Enter Employee ID: ");
	                String employeeId = scanner.nextLine();
	                System.out.print("Enter Employee Name: ");
	                String employeeName = scanner.nextLine();
	                Employee employee = new Employee(employeeId, employeeName);
	                employeeService.addEmployee(employee);
	                System.out.println("Employee added successfully.");
	                break;
	            case 2:
	                System.out.print("Enter Customer ID: ");
	                String customerId = scanner.nextLine();
	                Customer customer = new Customer(customerId, "Customer Name"); // Simplified for the example
	                employeeService.verifyCustomerDocuments(customer);
	                System.out.println("Customer documents verified.");
	                break;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }
	    }

	    private static void handleAgentOperations(AgentService agentService, Scanner scanner) {
	        System.out.println("1. Register Agent");
	        System.out.println("2. Update Agent Profile");
	        System.out.print("Choose an option: ");
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        switch (choice) {
	            case 1:
	                System.out.print("Enter Agent ID: ");
	                String agentId = scanner.nextLine();
	                System.out.print("Enter Agent Name: ");
	                String agentName = scanner.nextLine();
	                Agent agent = new Agent(agentId, agentName);
	                agentService.registerAgent(agent);
	                System.out.println("Agent registered successfully.");
	                break;
	            case 2:
	                System.out.print("Enter Agent ID: ");
	                agentId = scanner.nextLine();
	                System.out.print("Enter New Agent Name: ");
	                agentName = scanner.nextLine();
	                agent = new Agent(agentId, agentName);
	                agentService.updateAgentProfile(agent);
	                System.out.println("Agent profile updated successfully.");
	                break;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }
	    }

	    private static void handleCustomerOperations(CustomerService customerService, Scanner scanner) {
	        System.out.println("1. Register Customer");
	        System.out.println("2. Update Customer Profile");
	        System.out.println("3. View Customer Policies");
	        System.out.println("4. Withdraw Policy");
	        System.out.print("Choose an option: ");
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        switch (choice) {
	            case 1:
	                System.out.print("Enter Customer ID: ");
	                String customerId = scanner.nextLine();
	                System.out.print("Enter Customer Name: ");
	                String customerName = scanner.nextLine();
	                Customer customer = new Customer(customerId, customerName);
	                customerService.registerCustomer(customer);
	                System.out.println("Customer registered successfully.");
	                break;
	            case 2:
	                System.out.print("Enter Customer ID: ");
	                customerId = scanner.nextLine();
	                System.out.print("Enter New Customer Name: ");
	                customerName = scanner.nextLine();
	                customer = new Customer(customerId, customerName);
	                customerService.updateCustomerProfile(customer);
	                System.out.println("Customer profile updated successfully.");
	                break;
	            case 3:
	                System.out.print("Enter Customer ID: ");
	                customerId = scanner.nextLine();
	                customer = new Customer(customerId, "Customer Name"); // Simplified for the example
	                List<InsurancePlan> policies = customerService.getCustomerPolicies(customer);
	                System.out.println("Customer Policies:");
	                for (InsurancePlan plan : policies) {
	                    System.out.println(plan.getPlanId() + " - " + plan.getPlanName());
	                }
	                break;
	            case 4:
	                System.out.print("Enter Customer ID: ");
	                customerId = scanner.nextLine();
	                customer = new Customer(customerId, "Customer Name"); // Simplified for the example
	                System.out.print("Enter Plan ID to Withdraw: ");
	                String planId = scanner.nextLine();
	                InsurancePlan plan = new InsurancePlan(planId, "Plan Name", 0); // Simplified for the example
	                customerService.withdrawPolicy(customer, plan);
	                System.out.println("Policy withdrawn successfully.");
	                break;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }
	    }
	}