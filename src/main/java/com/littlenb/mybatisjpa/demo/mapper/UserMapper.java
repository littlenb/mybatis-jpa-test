package com.littlenb.mybatisjpa.demo.mapper;

import com.littlenb.mybatisjpa.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author lishiwei
 */
@Mapper
@Repository
public interface UserMapper extends IBaseMapper<User> {

  @Select("SELECT * FROM t_sys_user WHERE id = #{id}")
  User selectById(long userId);

  @Select("SELECT t.*,a.* FROM t_sys_user t,t_sys_user_archive a WHERE t.id = a.id and t.id = #{id}")
  User selectOneToOne(long userId);

  @Select("SELECT t.*,r.* FROM t_sys_user t LEFT JOIN t_relation_user_role r ON t.id = r.user_id WHERE t.id = #{id}")
  User selectOneToMany(long userId);

  User selectUnion(long userId);

}
