
public class trapping_rainwater {
    public int trap(int[] height) {
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];

        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];

        for(int i=1;i<height.length;i++){                           //left maximum auxilary array
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){                        // right maximum auxilary array
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trapped=0;
        for(int i=0;i<height.length;i++){                           //trapped water calculation
            trapped=trapped+(Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        return trapped;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        trapping_rainwater obj =new trapping_rainwater();
        int result = obj.trap(height);

        System.out.println("Trapped Water: " + result);
    }
}