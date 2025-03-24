package com.microservices.demo.kafka.admin.exception;

/**
 * @since       2025.03.24
 * @author      sony
 * @description
 **********************************************************************************************************************/
public class KafkaClientException extends RuntimeException{

    public KafkaClientException() {
    }

    public KafkaClientException(String message) {
        super(message);
    }

    public KafkaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}