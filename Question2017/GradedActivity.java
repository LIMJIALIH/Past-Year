
package Question2017;

class GradedActivity {
    private int score;
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public String getGrade(){
        if(score>=90) return "A";
        else if(score>= 80) return "B";
        else if(score>=70) return "C";
        else if(score>=60) return "D";
        else return "F";
    }
    
    @Override 
    public String toString(){
        return "Score: " + this.score + "\nGrade" +getGrade();
    }
}
