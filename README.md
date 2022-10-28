
### Environment Variable설정 방법
```yaml
SPRING_DATASOURCE_URL=jdbc:mysql://<host>:3306/likelion-db
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=1234
```

### Endpoint

GET /api/v1/

Hello World 출력

GET /api/v1/user/

User addAndGet

### Code 

application.yml

```java
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/likelion-db
    username: root
    password: 1q2w3e4r
```


Controller.java

```java
@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private final UserDao userDao;

    public HelloController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/user/")
    public User addAndGet() throws SQLException {
        userDao.add(new User("1", "Kyeongrok", "1234"));
        return userDao.findById("1");
    }
}
```
