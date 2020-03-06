package co.gc.CapstoneApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.CapstoneApi.entity.Movie;
import co.gc.CapstoneApi.entity.User;

public interface MovieDao extends JpaRepository<Movie, Long> {

	Movie findByTitleIgnoreCase(String name);

	User findByUsernameIgnoreCase(String username);

	Movie findByImdbID(String id);

	User save(User user);

}
