package com.user.security.poc.repository;

import com.user.security.poc.repository.model.UserModel;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface IUserRepository extends SecurityRepository<UserModel, Long>,
        JpaSpecificationExecutor<UserModel> {

    UserModel findByUsername(String userName);
}
