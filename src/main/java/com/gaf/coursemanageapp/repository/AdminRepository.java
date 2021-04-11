package com.gaf.coursemanageapp.repository;

import com.gaf.coursemanageapp.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {

//    @Query("SELECT u FROM Admin u WHERE u.userName = :username")
//    public Admin getAdminByUserName(@Param("username") String username);



    Optional<Admin> findByUserName(String userName);

    Boolean existsByUserName(String userName);
    Boolean existsByEmail(String email);
}
