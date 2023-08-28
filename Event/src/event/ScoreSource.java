/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;
import java.util.ArrayList;

/**
 *
 * @author josak
 */
public class ScoreSource {
    ArrayList<ScoreListener> observers;
    public ScoreSource(){
        observers = new ArrayList<>();
        
    }
    public void addObserver(ScoreListener obj){
        observers.add(obj);
    }
    public void setScoreLine(String value){
        fireHeadQuater(new ScoreEvent(this,value));
    }
    public void fireHeadQuater(ScoreEvent evt){
        for (ScoreListener observer : observers ){
            observer.scoreChange(evt);
        }
            
    }
}
