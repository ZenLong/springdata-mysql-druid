package com.codewalnut.service;

import com.codewalnut.model.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * 用户服务
 *
 * @author KelvinZ
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

    /**
     * 使用手机号码查询
     *
     * @param mobile
     * @return
     */
    Optional<User> findByMobile(String mobile);

    /**
     * 使用自定义查询
     *
     * @param mobilePrefix
     * @return
     */
    Page<User> findByCusomizedQuery(String mobilePrefix);

}
