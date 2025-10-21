package org.example.service;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
public class MathServices {
    public MathServices(){
    }
    public ArrayList factor(int n){
        ArrayList ls = new ArrayList();
        for (int i = 1; i <= n ; i++){
            if (n % i == 0){
                ls.add(i);
            }
        }
        return ls;
    }
    public ArrayList primo(int n){
        ArrayList ls = new ArrayList();
        for (int i = 1; i < n ; i++){
            if (factor(i).size() <= 2){
                ls.add(i);
            }
        }
        return ls;
    }
}