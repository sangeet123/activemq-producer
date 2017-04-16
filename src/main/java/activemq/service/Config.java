package activemq.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * Created by sangeet on 4/13/2017.
 */
@Configuration("active-mq")
@EnableJms() public class Config {
  private String queueName;

  @Value("${queue.name}")
  public void setQueueName(final String queueName){
    this.queueName = queueName;
  }

  @Bean public Queue queue() {
    return new ActiveMQQueue(queueName);
  }
}
