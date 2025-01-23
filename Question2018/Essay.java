
package Question2018;

class Essay extends GradedActivity{
    private int gram;
    private int spel;
    private int len;
    private int cont;
    
    public Essay(int gram, int spel, int len, int cont){
        this.gram = gram;
        this.spel = spel;
        this.len = len;
        this.cont = cont;
        super.setScore(this.gram+this.spel+this.len+this.cont);
    }
    
    @Override
    public String toString(){
        return "Grammar: " + gram + "\nSpelling: " + spel + "\nLength: " + len + "\nContent: " + cont + "\n" + super.toString();
    }
}
