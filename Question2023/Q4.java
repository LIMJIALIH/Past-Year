
package Question2023;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class nodelist{
    private String name;
    private double alloc;
    private double tot;
    private double realMemory;
    private double allocMemory;
    private String partitions;
    private double ratio;
    
    public nodelist(String name, double alloc, double tot, double realMemory, double allocMemory, String partitions){
        this.name = name;
        this.alloc = alloc;
        this.tot = tot;
        this.realMemory = realMemory;
        this.allocMemory = allocMemory;
        this.partitions = partitions;
        this.ratio = Math.abs(((this.tot-this.alloc)/this.tot) - ((int)((this.realMemory-this.allocMemory)/1000)/(this.realMemory/1000)));
    }
    
    @Override
    public String toString(){
        return String.format("%s%15s%10d/%d%10dG/%3dG%10.3f",name,partitions,(int)(tot-alloc),(int)(tot),(int)((realMemory-allocMemory)/1000),(int)(realMemory/1000), ratio);
    }
}

public class Q4 {
    public static void main(String[] args) {
        
        try{
            //Read the total line of the file
            BufferedReader reader = new BufferedReader(new FileReader("nodelist.txt"));
            String line;
            int count = 0;
            while((line = reader.readLine()) != null){
                count++;
            }
            String [] content = new String [count];
            
            //Insert the content of the file into array
            reader = new BufferedReader(new FileReader("nodelist.txt"));
            
            int num = 0;
            String newLine;
            while((newLine = reader.readLine()) != null){
                content[num] = newLine.trim();
                num++;
            }
            reader.close();
            
            nodelist [] node = new nodelist [13]; 
            int locationName = 0;
            int locationCPU = 1;
            int locationMemory = 7;
            int locationPartition = 9;
            
            for(int i = 0 ; i<node.length ; i++){
                
                String [] extract = content[locationName].split("=");
                String [] extract2 = content[locationCPU].split("=");
                String [] extract3 = content[locationMemory].split("=");
                
                node[i] = new nodelist(extract[1].substring(0, extract[1].indexOf(" ")),Double.parseDouble(extract2[1].substring(0,extract2[1].indexOf(" "))),Double.parseDouble(extract2[2].substring(0, extract2[2].indexOf(" "))),Double.parseDouble(extract3[1].substring(0, extract3[1].indexOf(" "))),Double.parseDouble(extract3[2].substring(0, extract3[2].indexOf(" "))),content[locationPartition].substring(11));
                locationName +=18;
                locationCPU +=18;
                locationMemory += 18;
                locationPartition += 18;
            }
            
            for(int i = 0 ; i<62;i++){
                if(i==0 || i == 61){
                    System.out.print("*");
                }else{
                System.out.print("-");
                }
            }
            
            System.out.printf("\n| %s%14s%12s%17s%11s |","Node","Partitions","CPU","MEMORY","RATIO");
            System.out.println();
            for(int i = 0 ; i<62;i++){
                if(i==0 || i == 61){
                    System.out.print("*");
                }else{
                System.out.print("-");
                }
            }
            for(nodelist nodes : node){
                System.out.print("\n|" + nodes.toString() + " |");
            }
            
            System.out.print("\n");
            for(int i = 0 ; i<62;i++){
                if(i==0 || i == 61){
                    System.out.print("*");
                }else{
                System.out.print("-");
                }
            }
        }catch(FileNotFoundException e){
            System.out.print("\nFile not found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
}
*/