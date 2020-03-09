package co.gc.CapstoneApi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.CapstoneApi.entity.Movie;
import co.gc.CapstoneApi.entity.User;

public interface MovieDao extends JpaRepository<Movie, Long> {

	Movie findByTitleIgnoreCase(String name);

	Movie findByImdbID(String id);
	
	List<Movie> findByUsers(User user);
}
