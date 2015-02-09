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

public class International extends Students{
    public String country;
    
    public International(int inpGender, String inpName, String inpCourse, String inpProgramme, int currentSemester, String inpCountry ) {
       super(inpGender, inpName, inpCourse, inpProgramme, currentSemester);
       country = inpCountry;
    }
    public void setCountry(String newCountry){
        country = newCountry;
    }
    public String getCountry(){
        return country;
    }
}
