package com.tivon.server.test;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	//shake mouse
	
    private static ArrayList <Integer>tmpArr = new ArrayList<Integer>();  
    public static void main(String[] args) {  
        int [] com = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};  
        
        for(int k = 0; k < com.length; k ++){
            combine(0 ,k ,com);  
        }

    }  
    public static void combine(int index,int k,int []arr) {  
        if(k == 1){  
            for (int i = index; i < arr.length; i++) {  
                tmpArr.add(arr[i]);  
                System.out.println(tmpArr.toString());  
                tmpArr.remove((Object)arr[i]);  
            }  
        }else if(k > 1){  
            for (int i = index; i <= arr.length - k; i++) {  
                tmpArr.add(arr[i]);  
                combine(i + 1,k - 1, arr);  
                tmpArr.remove((Object)arr[i]);  
            }  
        }else{  
            return ;   
        }  
    }  

}
