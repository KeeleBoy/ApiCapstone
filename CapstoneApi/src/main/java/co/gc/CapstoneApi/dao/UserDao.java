package co.gc.CapstoneApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.CapstoneApi.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByNameIgnoreCase(String name);

}
