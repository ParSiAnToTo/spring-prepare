package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo("requiredArg");
        memo.setContents("Robbie");
        System.out.println(memo.getUsername());
        System.out.println(memo.getContents());
    }
}