# springCloud
springcloud学习，基于springboot2.0.2

要点：
 在搭建服务提供者和消费者时一定要引入web包
 <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
</dependency>


feign的依赖包名字有点改变，需要引入spring-cloud-starter-openfeign
