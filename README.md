# springboot-kafka-project
Spring Boot + Apache Kafka project

### Technologies used:
- Java 11
- Maven
- Spring Boot
- Spring for Apache Kafka
- Lombok
- MySQL

In this project we read a huge amount of real-time stream data from the Wikimedia and write it to the database.
- First Kafka Producer reads real-time stream data from the Wikimedia.
- Then Producer writes data to the kafka broker.
- Kafka Consumer consumes that data from the kafka broker and writes it to the database.

### Architecture
![Arch](https://user-images.githubusercontent.com/83831759/173596531-f3407b87-9d18-4e96-bc27-2d48935b1ba5.png)

### Project Setup
![projectsetup](https://user-images.githubusercontent.com/83831759/173598625-9bc8b4f4-2869-437a-b9a0-3b51f0013288.png)
