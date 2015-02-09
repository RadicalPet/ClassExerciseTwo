/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassExercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jagenau
 */
public class Teachers extends People{
    
    public String programme;
    public String office;
    public List<String> courses = new ArrayList<>();
    
    public Teachers(int inpGender, String inpName, String inpProgramme, String inpOffice, List<String> inpCourses){
        super(inpGender, inpName);
        programme = inpProgramme;
        office = inpOffice;
        courses = inpCourses;
        
    }
    public void setProgramme(String newProgramme) {
        programme = newProgramme;
    } 
    public void setOffice(String newOffice) {
        office = newOffice;
    }
    public void setCourses(List<String> newCourses){
        courses = newCourses;
    }
    
    public String getProgramme() {
        return programme;
    } 
    public String getOffice() {
        return office;
    }
    public List<String> getCourses(){
        return courses;
    }
}
