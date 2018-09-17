package com.codewalnut.service;

import com.codewalnut.model.User;

import java.util.Optional;

/**
 * 用户服务
 *
 * @author KelvinZ
 * @date 2018-09-14 19:12.
 */
public interface UserService {

    /**
     * 保存实体
     *
     * @param user
     * @return
     */
    User save(User user);

    /**
     * 使用ID查询
     *
     * @param id
     * @return
     */
    Optional<User> findById(String id);

}
