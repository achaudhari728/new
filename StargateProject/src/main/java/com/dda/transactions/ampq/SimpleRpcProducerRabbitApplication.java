package com.dda.transactions.ampq;

import java.util.List;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.dda.transactions.model.Transaction;

@Component
public class SimpleRpcProducerRabbitApplication {

	private final RabbitTemplate template;

	@Autowired
	public SimpleRpcProducerRabbitApplication(RabbitTemplate template) {
		this.template = template;
	}

	public void sendMessage(List<Transaction> transactionDetails) {
		this.template.convertAndSend("spring-boot-test", transactionDetails.toString());
	}

	@Bean
	public Queue queue() {
		return new Queue("spring-boot-test", false);
	}
}
