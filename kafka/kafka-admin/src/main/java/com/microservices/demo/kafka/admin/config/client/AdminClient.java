package com.microservices.demo.kafka.admin.config.client;

import com.microservices.demo.config.KafkaConfigData;
import com.microservices.demo.config.RetryConfigData;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;


/**
 * @since       2025.03.21
 * @author      sony
 * @description
 **********************************************************************************************************************/
@Component
public class AdminClient {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaAdminClient.class);

    private final KafkaConfigData kafkaConfigData;
    private final RetryConfigData retryConfigData;
    private final AdminClient adminClient;
    private final RetryTemplate retryTemplate;

    public AdminClient(KafkaConfigData kafkaConfigData,
                       RetryConfigData retryConfigData,
                       AdminClient adminClient,
                       RetryTemplate retryTemplate) {
        this.kafkaConfigData = kafkaConfigData;
        this.retryConfigData = retryConfigData;
        this.adminClient = adminClient;
        this.retryTemplate = retryTemplate;
    }
}