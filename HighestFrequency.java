

public class HighestFrequency {
    
    public static void main(String[] args){
        
        int maxfrequency=0;
        int x=0;
        int[] arr={1,4,2,5,2,4,5,6,4,9,4};

        for(int i=0;i<arr.length;i++){
            int frequency=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    frequency++;
                }
            }
            if(frequency>maxfrequency){
                maxfrequency=frequency;
                x=arr[i];
                
            }
        }

        System.out.println("The number which occured most : "+x+" with frequency :"+maxfrequency);
        
    }
}
