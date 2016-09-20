package demo.maven.service;

/**
 * Hello service implementation.
 *
 * @author akuma
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        if (name == null || name.trim().length() == 0) {
            name = "world";
        }
        return "Hello " + name + "!";
    }

}
