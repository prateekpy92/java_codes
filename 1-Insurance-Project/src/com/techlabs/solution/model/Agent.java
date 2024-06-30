package com.techlabs.solution.model;

public class Agent {
    private String agentId;
    private String name;
    
    // Constructor, getters, and setters
    public Agent(String agentId, String name) {
        this.agentId = agentId;
        this.name = name;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
