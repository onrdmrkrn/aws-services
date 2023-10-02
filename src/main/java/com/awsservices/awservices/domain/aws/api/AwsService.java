package com.awsservices.awservices.domain.aws.api;

public interface AwsService {
         String subscribeMobile(String mobile);
         String publishMessageToSNSTopic(String message);
    public String publishMessageToSNSTopic(String message,String mobile );
}

