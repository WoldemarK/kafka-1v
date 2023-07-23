package com.example.kafka1v.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Message {

    private String myMessage;
    @Override
    public String toString() {
        return myMessage;
    }
}
