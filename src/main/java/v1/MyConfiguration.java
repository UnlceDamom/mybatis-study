package v1;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MyConfiguration {
    public <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, new MyMapperProxy());
    }
    
    /**
     * 模拟解析好的TestMapper
     */
    static class TestMapperXml {
        public static final String namespace = "mapper.TestMapper";
        
        public static final Map<String, String> methodSqlMapping = new HashMap<>();
        
        static {
            methodSqlMapping.put("selectByPrimaryKey", "select * from test where id = %d");
        }
    }
}
