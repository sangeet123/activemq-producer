package activemq.service;

/**
 * Created by sangeet on 4/13/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component public class Producer implements CommandLineRunner {

  @Autowired private JmsMessagingTemplate jmsMessagingTemplate;

  @Autowired private Queue queue;

  @Override public void run(final String... args) throws Exception {
  }

  public void send(final String msg) {
    this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
  }

}
