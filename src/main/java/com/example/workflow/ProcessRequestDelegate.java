package com.example.workflow;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessRequestDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Hello-Greetings");

    public void execute(DelegateExecution execution) throws Exception {
    	
    	
    
        LOGGER.info("Hey! " + execution.getVariable("Finishtime") + " "
                + "! Le vent  "
                + " est de "
                +  execution.getVariable("WsResponse2")
                + " à l période qui commence de  "
                + execution.getVariable("pw")
                +execution.getVariable("ppv")
                + execution.getVariable("WsResponse1")+"!");
        
    }
    
    

}
