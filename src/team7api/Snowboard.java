/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team7api;

/**
 * Snowboard Object Class
 * @author zabuz
 */
public class Snowboard {
    /**
     * Data set from snowboard
     */
    byte[] snowboardDataSet;
    
    
    Snowboard(){
        snowboardDataSet = new byte[100];
    
    }

    /**
     * Returns data set as byte array
     */
    public byte[] getSnowboardDataSet() {
        return snowboardDataSet;
    }

    
    /**
     * Sets data set as byte array
     */
    public void setSnowboardDataSet(byte[] snowboardDataSet) {
        this.snowboardDataSet = snowboardDataSet;
    }
    
}
