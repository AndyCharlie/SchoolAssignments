/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk4;

/**
 *
 * @author Adeat
 */
public class Team {
    String teamName;
    String teamMascot;
    String teamColor;
    
    public Team(String tName, String tMascot, String tColor) {
        teamName = tName;
        teamMascot = tMascot;
        teamColor = tColor;
    }
    public String getName(){
        return teamName;
    }
    public String getMascot(){
        return teamMascot;
    }
    public String getColor(){
        return teamColor;
    }
    public String toString(){
        String out = ("Team Name: " + teamName + "\n" +
                      "Team Mascot: " + teamMascot + "\n" +
                      "Team Color: " + teamColor);
        return out;
    }
}
