package com.codewalnut.dao;

import com.codewalnut.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * 数据访问类
 *
 * @author KelvinZ
 */
public interface UserDao extends JpaRepository<User, String> {

    Optional<User> findByMobile(String mobile);

    @Query(value = "SELECT A.* FROM druid_demo_user A WHERE A.mobile like concat(?1, '%') ORDER BY A.id ASC", countQuery = "SELECT count(1) FROM druid_demo_user A WHERE A.mobile like concat(?1, '%') ORDER BY A.id ASC", nativeQuery = true)
    Page<User> findByCustomizedQuery(String mobilePrefix, Pageable pageable);

}
