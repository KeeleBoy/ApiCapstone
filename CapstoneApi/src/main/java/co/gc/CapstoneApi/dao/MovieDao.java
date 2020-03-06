package co.gc.CapstoneApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.CapstoneApi.entity.Movie;

public interface MovieDao extends JpaRepository<Movie, Long> {
	
	Movie findByTitleIgnoreCase(String name);
	
	Movie findByImdbID(String id);
}
