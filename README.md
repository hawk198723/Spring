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
## Basic injection register application.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans
https://www.springframework.org/schema/beans/spring-beans.xsd">
<bean id="address" class="com.jason.pojo.Address">
<property name="address" value="San Diego"/>
</bean>

    <bean id="student" class="com.jason.pojo.Student">
        <property name="name" value="jason"/>
        <property name="address" ref="address"/>
        <property name="books">
            <array>
                <value>Spider Comic</value>
                <value>Batman Comic</value>
                <value>Superman Comic</value>
            </array>
        </property>
        <property name="hobbys">
            <list>
                <value>Running</value>
                <value>Basketball</value>
                <value>Hiking</value>
            </list>
        </property>
        <property name="card">
            <map>
                <entry key="ID" value="33535808"/>
                <entry key="Gender" value="Male"/>
            </map>
        </property>
        <property name="games">
            <set>
                <value>Mario</value>
                <value>Kirby</value>
                <value>Pacman</value>
            </set>
        </property>
        <property name="wife">
            <null/>
        </property>
        <property name="info">
            <props>
                <prop key="ID">984759485</prop>
                <prop key="gender">frmale</prop>
                <prop key="name">root</prop>
                <prop key="password">password</prop>
            </props>
        </property>
    </bean>
</beans>
```

## Basic Annotation Injection register application.xml 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:context="http://www.springframework.org/schema/context"
xsi:schemaLocation="http://www.springframework.org/schema/beans
https://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/context
https://www.springframework.org/schema/context/spring-context.xsd">
<context:annotation-config/>

    <bean id="cat" class="com.jason.pojo.Cat"/>
    <bean id="cat111" class="com.jason.pojo.Cat"/>
    <bean id="dog" class="com.jason.pojo.Dog"/>
    <bean id="dog222" class="com.jason.pojo.Dog"/>

    <bean id="person" class="com.jason.pojo.Person" />


</beans>
```


## Annotation-based Container Configuration
````
-@Autowired: byType first , then byName (doesn't need set method)
   if Autowired cannot work(have two same types), then we need @Qualifier(value="xxxx")
-@Resorce: byName first, then byType (it's a Java annotation)
-@Nullable: means this prop could be null
-@Component: this component is bean, be in charged by Spring
````