# Spring Boot 2.0 Kafka ���ּܴ���

- ����zookeeper
C:\Users\jinhang>zkServer

- kafka�������� (application.yml��consumer.propertiesһ��)
consumer.properties��
# consumer group id
group.id=test-consumer-group

application.yml��
spring.kafka.consumer.group-id: test-consumer-group

- ����kafka
C:\Program\kafka_2.11-1.1.0>.\bin\windows\kafka-server-start.bat .\config\server.properties


- ����Java

- ������� http://localhost:8080/TopicOne/send ����