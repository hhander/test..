package com.demo1;

public class ArrayUtil {
    private ArrayUtil()
    {

    }

    public static String toString(String[] arr)
    {
        if(arr == null)
        {
            return null;
        }

        String Str = "[";


        for (int i = 0; i < arr.length; i++)
        {
            Str += (i==arr.length -1 ? arr[i] : arr[i] + ",");
        }
        Str = (Str + "]");

        return Str;
    }

}
