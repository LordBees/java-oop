package com.task;

/**
 * Created by 10740071 on 24/04/2017.
 */
public class squarecalculator {
    //attributes
    static float width = 13.5f;
    static float height = 25.3f;
    float perimiter = 0;
    float area = 0;

   // width = 13.5f;
   // height = 25.3f;

    //methods
    private static float calculatePerimiter(float width,float height){//calcs perimiter of rectangle/square
        //perimiter = (width+height)*2;
        //return perimiter;
        return (width+height)*2;
    }
    private static float calculateArea(float width,float height){//calcs area of rectangle/square
        //area = (width*height);
        //return area;
        return (width*height);
    }
    public static void run(){//method for running
        System.out.println("width="+width+" height="+height);
        System.out.println("perimiter: "+calculatePerimiter(width,height));
        System.out.println("area: "+calculateArea(width,height));
    }
}
