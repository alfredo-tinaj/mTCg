package com.example.mtcg.card;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Card> Stack;

    public Stack(){
        this.Stack = new ArrayList<>();
    }

    public void addCard(Card card){
        this.Stack.add(card);
    }

    public void removeCard(Card toRemove) {
        this.Stack.remove(toRemove);
    }
}
