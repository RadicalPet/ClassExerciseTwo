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
public class Students extends People {
        
    public String programme;
    public String course;
    public int semester;

 
    public Students(int inpGender, String inpName, String inpCourse, String inpProgramme, int currentSemester ) {
        super(inpGender, inpName);
        programme = inpProgramme;
        course = inpCourse;
        semester = currentSemester;
    }
    
    public void setProgramme(String newProgramme) {
        programme = newProgramme;
    } 
    public void setCourse(String newCourse) {
        course = newCourse;
    }
    public void setSemester(int newSemester){
        semester = newSemester;
    }
    
    public String getProgramme() {
        return programme;
    } 
    public String getCourse() {
        return course;
    }
    public int getSemester(){
        return semester;
    }
}
