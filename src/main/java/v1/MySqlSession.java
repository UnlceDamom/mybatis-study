package v1;

import java.lang.reflect.Proxy;

public class MySqlSession {
    private MyExecutor executor;
    private MyConfiguration configuration;
    
    public MySqlSession(MyExecutor executor, MyConfiguration configuration) {
        this.executor = executor;
        this.configuration = configuration;
    }
    
    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz);
    }
    
    public void selectOne() {
    
    }
}
