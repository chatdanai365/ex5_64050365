/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import java.util.EventObject;

/**
 *
 * @author josak
 */
public class ScoreEvent extends EventObject {
    private String Score;
    public String getScore (){
        return Score;
    }
    public ScoreEvent(Object o,String value) {
        super(o);
        Score = value;
    }
    
}