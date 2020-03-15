package v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyMapperProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(MyConfiguration.TestMapperXml.namespace)) {
            String sql = MyConfiguration.TestMapperXml.methodSqlMapping.get(method.getName());
            MyExecutor executor = new MySimpleExecutorImpl();
            return executor.query(sql, String.valueOf(args[0]));
        }
        return method.invoke(this, args);
    }
}
