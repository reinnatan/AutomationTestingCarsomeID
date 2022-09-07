# Automation web testing carsome.id
## Software Requirement
    - Selenium
    - SpringBoot
## Dependencies Requirement
    ```
        <?xml version="1.0" encoding="UTF-8"?>
        <project xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
    
        <groupId>org.example</groupId>
        <artifactId>SpringBootTesting</artifactId>
        <version>1.0-SNAPSHOT</version>
    
        <properties>
            <maven.compiler.source>8</maven.compiler.source>
            <maven.compiler.target>8</maven.compiler.target>
    
        </properties>
    
        <dependencies>
                <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter -->
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter</artifactId>
                    <version>2.6.3</version>
                </dependency>
        
                <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-test</artifactId>
                    <version>2.6.3</version>
                    <scope>test</scope>
                </dependency>
        
                <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
                <dependency>
                    <groupId>org.seleniumhq.selenium</groupId>
                    <artifactId>selenium-java</artifactId>
                    <version>4.4.0</version>
                </dependency>
        
                <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
                <dependency>
                    <groupId>io.github.bonigarcia</groupId>
                    <artifactId>webdrivermanager</artifactId>
                    <version>5.3.0</version>
                </dependency>
        
                <!-- https://mvnrepository.com/artifact/junit/junit -->
                <dependency>
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                    <version>4.13.2</version>
                    <scope>test</scope>
                </dependency>
            </dependencies>
        
             <build>
                 <plugins>
                     <plugin>
                         <groupId>org.springframework.boot</groupId>
                         <artifactId>spring-boot-maven-plugin</artifactId>
                     </plugin>
                 </plugins>
             </build>
        
        </project>
    ```
# Result Testing