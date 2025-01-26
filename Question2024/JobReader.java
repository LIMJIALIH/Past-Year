
package Question2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class JobReader {
    public static void main(String[] args) {
        Job [] jobs = readJobsFromDirectory("Job.txt");
        
        listAllJobs(jobs);
        generateStatistics(jobs);
    }
    
    public static Job[] readJobsFromDirectory(String directory){
        Job [] jobs = null;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(directory));
            int count = 0;
            String line;
            
            while((line = reader.readLine()) != null){
                count++;
            }
            
            jobs = new Job[count];
            
            reader = new BufferedReader(new FileReader(directory));
            int i = 0;
            while((line = reader.readLine()) != null){
                String [] content = line.trim().split(",");
                jobs[i] = new Job(content[0],content[1],content[2],content[3]);
                i++;
            }
            
            reader.close();
        }catch(FileNotFoundException e){
            System.out.print("\nFile not found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
        return jobs;
    }
    
    public static void listAllJobs(Job [] jobs){
        System.out.print("\nList of all jobs:");
        for(Job job:jobs){
            System.out.print("\n" + job.toString());
        }
    }
    
    public static void generateStatistics(Job[] jobs) {
    String[] partitions = new String[4];
    int[] partitionCnt = new int[4];
    int partitionNum = 0;

    for (Job job : jobs) {
        String[] split = job.getPartition().trim().split(":");
        String partition = split[1];

        boolean found = false;

        for (int j = 0; j < partitionNum; j++) {
            if (partition.equalsIgnoreCase(partitions[j])) {
                partitionCnt[j]++;
                found = true;
                break;
            }
        }

        if (!found && partitionNum < partitions.length) {
            partitions[partitionNum] = partition;
            partitionCnt[partitionNum]++;
            partitionNum++;
        }
    }

    System.out.println("\nPartition Statistics:");
    for (int i = 0; i < partitionNum; i++) {
        System.out.println(partitions[i] + ": " + partitionCnt[i]);
    }
    
    String [] qosName = new String [3];
    int [] qosCnt = new int [3];
    int qosNum = 0;
    for(Job job : jobs){
        String [] split = job.getQos().split(":");
        String qos = split[1].trim();
        
        boolean previous = false;
        
        for(int i = 0 ; i < qosNum ; i++){
            if(qos.equalsIgnoreCase(qosName[i])){
                previous = true;
                qosCnt[i]++;
                break;
            }
        }
        
        if(!previous && qosNum < qosName.length){
            qosName[qosNum] = qos;
            qosCnt[qosNum]++;
            qosNum++;
        }
        
    }
    
        System.out.println("\nQos Statistics:");
    for (int i = 0; i < qosCnt.length; i++) {
        System.out.println(qosName[i] + ": " + qosCnt[i]);
    }
    
}
}
