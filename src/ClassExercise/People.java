/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassExercise;
/**
 *
 * @author jagenau
 */
public class People {
        

    public int gender;
    public String name;
        

    public People(int inpGender, String inpName) {
        gender = inpGender;
        name = inpName;
    }
        

    public void setGender(int newValue) {
        gender = newValue;
    }
        
    public void setName(String newName) {
        name = newName;
    }
    public int getGender() {
        return gender;
    }
        
    public String getName() {
        return name;
    }
      
}