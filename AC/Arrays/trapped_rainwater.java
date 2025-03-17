package AC.Arrays;

public class trapped_rainwater{
    public static int trappedrainwater(int [] height){
        //First we need to calculate left max boundary - array
        int [] leftmax = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //Next right max boundary
        int [] rightmax = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        //above both are auxillary arrays

        //loop
        int trappedWater = 0;
        for(int i=0; i<height.length; i++){
            //in the loop -> waterLevel = min(leftmax bound, rightmax bound)
           int waterLevel = Math.min(leftmax[i],rightmax[i]);

           //trapped water = (waterLevel - height) * width
           trappedWater += waterLevel - height[i]; 
           //considering the width as 1
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}