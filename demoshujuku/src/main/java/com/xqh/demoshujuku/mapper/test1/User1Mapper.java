package com.xqh.demoshujuku.mapper.test1;

import com.xqh.demoshujuku.enums.UserSexEnum;
import com.xqh.demoshujuku.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午1:51 2019/3/22
 * @ModifiedBy:
 */
public interface User1Mapper {
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    User getOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(User user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
