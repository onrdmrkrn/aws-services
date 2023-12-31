package com.awsservices.awservices.domain.aws.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsRequestDto {

    private String message;
    private String mobile;
}
