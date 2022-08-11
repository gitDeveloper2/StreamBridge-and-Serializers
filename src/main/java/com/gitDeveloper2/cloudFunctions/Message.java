package com.gitDeveloper2.cloudFunctions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Message {
    private String message;
        private String owner;
        private int nu;
}
