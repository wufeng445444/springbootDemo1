package com.wf.dao;

        import com.wf.entity.User;
        import org.springframework.data.jpa.repository.JpaRepository;
//<User,Integer>第一个参数是指实体类，第二个参数是指实体类的id
public interface UserDao extends JpaRepository<User,Integer> {

}
