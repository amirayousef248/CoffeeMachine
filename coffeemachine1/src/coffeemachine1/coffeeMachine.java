/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */
public class coffeeMachine {
    private int watercapacity = 3000;
    private int maxwatercapacity;
    private int cups=30;
    private wastTray wt;
    private beansContener beans;
    private wastTray wtray;
    private Grinder grinder;
    private Logger log;

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }
    
    public coffeeMachine() {
    }

    public int getMaxwatercapacity() {
        return maxwatercapacity;
    }

    public void setMaxwatercapacity(int maxwatercapacity) {
        this.maxwatercapacity = maxwatercapacity;
    }
    
    public coffeeMachine(wastTray wt, beansContener beans, wastTray wtray, Grinder grinder, Logger log) {
        this.wt = wt;
        this.beans = beans;
        this.wtray = wtray;
        this.grinder = grinder;
        this.log = log;
    }
    
    public int getwatercapacity() {
        return this.watercapacity;
    }
    
    public void setwatercapacity(int capacity) {
        this.watercapacity = capacity;
    }
    
    public wastTray getWt() {
        return wt;
    }
     
    public int getbeanscap(){
        return this.beans.getCapacity();
    }
    
    public void setbeanscap(int beans){
        this.beans.setCapacity(beans);
    }
    public void setWt(wastTray wt) {
        this.wt = wt;
    }

    public beansContener getBeans() {
        return beans;
    }

    public void setBeans(beansContener beans) {
        this.beans = beans;
    }

    public wastTray getWtray() {
        return wtray;
    }

    public void setWtray(wastTray wtray) {
        this.wtray = wtray;
    }

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }
    
    
    
    
}