/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task10_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class Fruit {
private boolean formalin = false;
    public String name = "";
    public Fruit(boolean formalin, String name){
        this.formalin = formalin;
        this.name = name;    
    }    
    public String getName(){
        return name;
    }
    public boolean hasFormalin(){
        return formalin;
    }
}

