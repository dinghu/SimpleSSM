package com.fast.develop.dao;


import com.fast.develop.entity.SysRoleEntity;
import com.fast.develop.entity.UserWindowDto;

import java.util.List;

/**
 * 角色管理
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2016年9月18日 上午9:33:33
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 查询用户创建的角色ID列表
     */
    List<Long> queryRoleIdList(Long createUserId);

    /**
     * 查询角色审批选择范围
     * @return
     */
    List<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto);
}
