package com.techlabs.solution.model;

import java.util.ArrayList;
import java.util.List;

public class AgentServiceImpl implements AgentService {
    private List<Agent> agents = new ArrayList<>();

    @Override
    public void registerAgent(Agent agent) {
        agents.add(agent);
    }

    @Override
    public void updateAgentProfile(Agent agent) {
        // Business logic to update agent profile
    }
}
