# Spring Boot 2.0 Kafka 脚手架代码

- 运行zookeeper
C:\Users\jinhang>zkServer

- kafka消费配置 (application.yml和consumer.properties一致)
consumer.properties：
# consumer group id
group.id=test-consumer-group

application.yml：
spring.kafka.consumer.group-id: test-consumer-group

- 运行kafka
C:\Program\kafka_2.11-1.1.0>.\bin\windows\kafka-server-start.bat .\config\server.properties


- 运行Java

- 打开浏览器 http://localhost:8080/TopicOne/send 测试