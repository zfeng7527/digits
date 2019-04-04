package com.company;
import java.util.ArrayList;

public class Digits {
    int number;
public Digits(int number){
    this.number=number;
}
    public ArrayList<Integer> arr(int number){
        ArrayList<Integer> phart=new ArrayList<>();
        for(int mod=10; number!=0; mod=mod*10 ){
            int remainder=number%mod;
            phart.add(0,remainder);
            number=-remainder;
        }
        return phart;
    }

}
