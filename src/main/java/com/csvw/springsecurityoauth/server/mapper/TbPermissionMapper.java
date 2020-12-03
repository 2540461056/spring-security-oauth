package com.csvw.springsecurityoauth.server.mapper;

import com.csvw.springsecurityoauth.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
 * @author lk
 */
public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}
