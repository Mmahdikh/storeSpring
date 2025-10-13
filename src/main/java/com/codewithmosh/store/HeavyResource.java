package com.codewithmosh.store;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy

@Component
@Lazy
public class HeavyResource{
    public HeavyResource(){
    
    System.out.println("HeavyRecource created")
    }


}
