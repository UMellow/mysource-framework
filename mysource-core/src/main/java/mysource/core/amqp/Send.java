package mysource.core.amqp;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	/**
	 * 队列名称
	 */
	private final static String QUEUE_NAME = "hello";
	
	public static void main(String[] args) throws IOException, TimeoutException {
		
		// 创建连接
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		
		// 创建信道
		Channel channel = connection.createChannel();
		// 声明队列
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		
		String message = "Hello World!";
		// 发布消息
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		
		System.out.println(" [x] send: " + message);
		
		// 关闭连接
		channel.close();
		connection.close();
	}

}
