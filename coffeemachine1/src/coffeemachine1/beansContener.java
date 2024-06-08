/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */
public class beansContener {
    
    static int capacity =300;

    public void setCapacity(int capacity) {
        beansContener.capacity = capacity;
    }
    String[] types = new String[]{"Arabica","Robusta","Blend"};
    private int level;

    public int getCapacity() {
        return capacity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    
    public void fillBeans(int amount){
        try{
            if (amount<14);
        }
        catch(Exception e){
            System.out.println("fillBeans");
        }
        
        
    }
    public void drawBeans(int amount){
        
    }
}