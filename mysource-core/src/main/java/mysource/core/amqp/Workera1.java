package mysource.core.amqp;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class Workera1 {

	// 队列名称
	private static final String TASK_QUEUE_NAME = "task_queue";
	
	public static void main(String[] args) throws IOException, TimeoutException, ShutdownSignalException, ConsumerCancelledException, InterruptedException {
		
		// 创建连接
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		
		// 创建信道
		Channel channel = connection.createChannel();
		// 声明队列
		channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);
		channel.basicQos(1);
		
		// 接收消息，不自动ack
		QueueingConsumer consumer = new QueueingConsumer(channel);
		channel.basicConsume(TASK_QUEUE_NAME, false, consumer);
		
		while(true){
			QueueingConsumer.Delivery delivery = consumer.nextDelivery();
			String message = new String(delivery.getBody());
			
			System.out.println(" [x] Recv: " + message);
			
			Thread.sleep(10000);
			channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
		}
	}

}
