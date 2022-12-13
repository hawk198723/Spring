## Denpendencies
```xml
<dependencies>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.22.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>3.8.2</version>
            <scope>test</scope>
        </dependency>
</dependencies>
```
## Annotation-based Container Configuration

-@Autowired: byType first , then byName
    if Autowired cannot work, then we need @Qualifier(value="xxxx")
-@Resorce: byName first, then byType
-@Nullable: means this prop could be null

