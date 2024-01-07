package com.cozastore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cozastore.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	UserEntity findByEmail(String email);
	
	UserEntity findByUsername(String username);
	
    UserEntity findByUsernameAndPassword(String username, String password);
    
    Boolean existsByUsername(String username);
    
    Boolean existsByEmail(String email);

    @Query("SELECT u FROM user u WHERE u.username LIKE %:query% OR u.email LIKE %:query%")
    List<UserEntity> searchUsers(@Param("query") String query);


	
}
