package mapper;

import entity.Test;

public interface TestMapper {
    Test selectByPrimaryKey(Integer id);
}
