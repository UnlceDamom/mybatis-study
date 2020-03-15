package v1;

public interface MyExecutor {
    <T> T query(String statement, String parameter);
}
