package com.tranhatan.Social.Learning.repository;

import com.tranhatan.Social.Learning.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import java.util.List;

//Annatation
//@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    //    use pageable
    Page<User> findByUsername(String username, Pageable pageable);
    Page<User> findByUsernameContaining(String username, Pageable pageable);


    // find username vs Email
//    findbyUserNameAndEmail -> Jpa sẽ(xóa findby) -> UserNameAndEmail
//    userNameAndEmail
//    userNameAndEmail
//    where userName = ?1 and Email =?1
    User findByUsernameAndEmail(String username, String email);

    /*
    WHERE userName LIKE %?
     */
    List<User> findByUsernameStartingWith(String username);    /*
    WHERE userName LIKE ?%
     */

    List<User> findByUsernameEndingWith(String username);

    /*
    WHERE id < 1
    */
    List<User> findByIdLessThan(Long id);

    //    RAW jpql
    @Query("SELECT u FROM User u WHERE u.id = (SELECT MAX(p.id) FROM User p)")
    User findMaxIdUser();

    @Query("SELECT u FROM User u WHERE u.username = ?1 AND u.email = ?2")
    List<User> getUserBy(String username, @Param("email") String email);

    @Query("SELECT u FROM User u WHERE u.username = :username AND u.email = :email")
    List<User> getUserByTwo(@Param("username") String username, @Param("email") String email);

    //    UPDATE Và DELETE
    @Modifying
    @Query("UPDATE User u SET u.email = :username")
    @Transactional
    int updateUserName(@Param("username") String username);

    //    native querry
    /*
     *get count user use native query
     */
    @Query(value = "SELECT COUNT(id) FROM users", nativeQuery = true)
    long getTotalUser();
}
