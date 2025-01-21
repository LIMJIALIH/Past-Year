package Question2017;

class Essay extends GradedActivity {
    private int grammar;
    private int spelling;
    private int length;
    private int content;
    
    public Essay(int grammar, int spelling, int length, int content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        super.setScore( grammar+ spelling+ length + content);
    }
    
    @Override
    public String toString(){
        return "\nGrammar: " + grammar + "\nSpelling: " + spelling + "\nLength: " + length + "\nContent: " + content + "\n\nTotal Score: " + super.getScore() + "\nEssay grade: " + super.getGrade();
    }
}
