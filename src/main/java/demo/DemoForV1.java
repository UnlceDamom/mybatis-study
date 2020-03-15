package demo;

import entity.Test;
import mapper.TestMapper;
import org.apache.ibatis.executor.SimpleExecutor;
import v1.MyConfiguration;
import v1.MySimpleExecutorImpl;
import v1.MySqlSession;

public class DemoForV1 {
    public static void main(String[] args) {
        MySqlSession sqlSession = new MySqlSession(new MySimpleExecutorImpl(), new MyConfiguration());
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        Test test = mapper.selectByPrimaryKey(1);
        System.err.println(test);
    }
}
