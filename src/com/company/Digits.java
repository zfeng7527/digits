package com.company;
import java.util.ArrayList;

public class Digits {
    int number;
public Digits(int number){
    this.number=number;
}
    public ArrayList<Integer> arr(){
        ArrayList<Integer> phart=new ArrayList<>();
        for(int mod=10; number!=0; number=number/10 ){
            int remainder=number%mod;
            phart.add(0,remainder);
        }
        return phart;
    }

}
