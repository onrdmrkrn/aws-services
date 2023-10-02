package com.awsservices.awservices.domain.aws.web;

import com.awsservices.awservices.domain.aws.api.AwsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("notificition")
public class AwsController {
    private final AwsService awsService;

    @PostMapping("subscribe/{mobile}")
    public String subscribeMobile(@PathVariable(value = "mobile") String mobile) {
        String response = awsService.subscribeMobile(mobile);
        return String.format("Sns Subscribe Response: %s", response);
    }
    @PostMapping("customer-sms")
    public String sendCustomerSms(@RequestBody SmsRequestDto smsRequestDto) {
        String response = awsService.publishMessageToSNSTopic(smsRequestDto.getMessage(),smsRequestDto.getMobile());
        return String.format("Sns Publish Response: %s", response);
    }


}
