package com.task;

/**
 * Created by 10740071 on 24/04/2017.
 */
public class velocity {
    static float time = 120.0f;
    static float distance = 15.6f;

    private static float calcVelocity(float t,float d){//calculates velocity
        return d/t;
    }
    public static void run(){
        System.out.println("time="+time+" distance="+distance);
        System.out.println("perimiter: "+calcVelocity(time,distance));

    }
}
