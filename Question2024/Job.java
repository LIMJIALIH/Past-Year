
package Question2024;

public class Job {
    private String jobName;
    private String partition;
    private String memory;
    private String qos;
    
    public Job(String jobName, String partition, String memory, String qos){
        this.jobName = jobName;
        this.partition = partition;
        this.memory = memory;
        this.qos = qos;
    }
    
    public String getJobName(){
        return jobName;
    }
    
    public String getPartition(){
        return partition;
    }
    
    public String getMemory(){
        return memory;
    }
    
    public String getQos(){
        return qos;
    }
    
    @Override
    public String toString(){
        return jobName + ", " + partition + ", " + memory + ", " + qos;
    }
}
