package org.mld.mapper;
import org.apache.ibatis.annotations.Select;
import org.mld.po.Appuser;
public interface AppuserMapperSelf {
    @Select("select * from appuser where login_name=#{loginName}")
    Appuser findUserByLName(String loginName);
}