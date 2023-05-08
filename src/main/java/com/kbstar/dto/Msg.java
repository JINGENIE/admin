package com.kbstar.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Msg {
    public String sendid;
    public String receiveid;
    public String content1;
}
