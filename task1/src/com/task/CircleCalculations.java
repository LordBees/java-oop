package com.task;

/**
 * Created by 10740071 on 24/04/2017.
 */
public class CircleCalculations {
    static float circleradius = 12.0f;

    private static float calculateDiameter(float Cradius){
        return Cradius*2.0f;
    }
    private static float calculateCirc(float Cradius){
        return 3.14f*Cradius*2;
    }
    private static float calculateArea(float Cradius){
        return 3.14f*Cradius;
    }
    public static void run(){
        System.out.println("radius="+circleradius);
        System.out.println("diameter: "+calculateDiameter(circleradius));
        System.out.println("circumference: "+calculateCirc(circleradius));
        System.out.println("area: "+calculateArea(circleradius));
    }

}
