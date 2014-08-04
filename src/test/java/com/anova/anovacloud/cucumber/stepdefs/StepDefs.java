

package com.anova.anovacloud.cucumber.stepdefs;

public class StepDefs {
    protected void sleep(long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
        }
    }
}
