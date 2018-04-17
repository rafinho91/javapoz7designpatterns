package com.sda.chain;

public class FirefightersChainItem implements ChainItem {
    @Override
    public boolean isMyResponsibility(String value) {
        return value.contains("fire");
    }

    @Override
    public void action(String value) {
        System.out.println("Action for firefighters");
    }
}
