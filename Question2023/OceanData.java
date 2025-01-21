
package Question2023;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class DataBuoy{
    private String id;
    private int lat;
    private int longitude;
    private String air_t;
    private float water_t;
    
    public DataBuoy(String id, int lat, int longitude, String air_t, float water_t){
        this.id = id;
        this.lat = lat;
        this.longitude = longitude;
        this.air_t = air_t;
        this.water_t = water_t;
    }
    
    public float getWaterTemp(){
        return water_t;
    }
    
    public int getLat(){
        return lat;
    }
    
    public int getLong(){
        return longitude;
    }
    
    public void setLat(int lat){
        this.lat = lat;
    }
    
    public void addLong(int add){
        this.longitude += add;
    }
    
    @Override
    public String toString(){
        return String.format("\n%-30s%-10s%-10s%-10s%-10s",id,lat,longitude,air_t,water_t);
    }
    
}
public class OceanData {
    public static void main(String[] args) {
        String inputFile = "ocean_data.csv";
        DataBuoy [] data = new DataBuoy[25];
        float avg_water_temp;
        
        loadData(inputFile,data);
        showData(data);
        
        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is "
        + avg_water_temp);
        
        printMap(data,avg_water_temp);
    }
    
    public static void loadData(String filename, DataBuoy [] data){
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            
            String content;
            int num = 0;
            
            while ((content = reader.readLine()) != null){
                String [] part = content.split(",");
                
                data[num] = new DataBuoy(part[0],Integer.parseInt(part[1]),Integer.parseInt(part[2]),part[3],Float.parseFloat(part[4]));
                num++;
                
            }
            
            reader.close();
            
        }catch(FileNotFoundException e){
            System.out.print("\nFile not Found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
    
    public static void showData(DataBuoy [] data){
        System.out.print("\nData read from buoy:");
        System.out.printf("\n%-30s%-10s%-10s%-10s%-10s","buoy_id","lat","long","air_t","water_t");
        
        for(DataBuoy datas : data){
            
            System.out.print(datas.toString());
        
        }
        
    }
    
    public static float calculateAvgWaterTemp(DataBuoy [] data){
        float total = 0;
        
        for(int i = 0 ; i<data.length ; i++){
            total += data[i].getWaterTemp();
        }
        
        float average = total/data.length;
        return average;
        
    }
    //Rows latitude column longitude
    public static void printMap(DataBuoy [] data, float avg){
        
        for(int i = 0 ; i< data.length ; i++){
            if(data[i].getLat()<0){
               data[i].setLat((-(data[i].getLat())) + 10);
            }
            data[i].addLong(10);
        }
        
        String [][] location = new String [21][21];
        
        for(int i = 0 ; i<location.length;i++){
            for(int j = 0 ; j<location[i].length;j++){
                for(int z = 0 ; z<data.length ; z++){
                    if(data[z].getLat() == i && data[z].getLong() == j){
                        if(data[z].getWaterTemp() < avg){
                            location[i][j] = "C";
                        }
                        else if(data[z].getWaterTemp() > avg){
                            location[i][j] = "H";
                        }
                        else if(data[z].getWaterTemp() == avg){
                            location[i][j] = "A";
                        }
                        
                    }
                }
                if(location[i][j] == null){
                    location[i][j] = "~";
                }
            }
        }
        
        location[10][10] = "N";
        
        for(int i = 0 ; i<location.length ; i++){
            for(int j = 0 ; j<location[i].length ; j++){
                System.out.print(location[i][j]);
            }
            System.out.print("\n");
        }
    }
}
*/