package com.dxc.dxcapp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dxc.dxcapp.service.MovieService;
import com.dxc.dxcapp.entity.Movie;
@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	MovieService movieService;

	// http://localhost:8562/movie/all
	/*@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Movie> getAllMovies() {
		return this.movieService.getAllMovies();
	}

	// http://localhost:8562/movie/addMovie
	@RequestMapping(value = "/addMovie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie addMovie(@RequestBody Movie movie) {
		return this.movieService.addMovie(movie);
	}

	// http://localhost:8562/movieinfo/updateMovie
	@RequestMapping(value = "/updateMovie", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie updateMovie(@RequestBody Movie movie) {
		return this.movieService.updateMovie(movie);
	}

	// http://localhost:8562/movie/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Movie> getMovie(@PathVariable int id) {
		return this.movieService.getMovieById(id);
	}

	// http://localhost:8562/movie/all
	@RequestMapping(value = "/all", method = RequestMethod.DELETE)
	public void deleteAllMovies() {
		this.movieService.deleteAllMovies();
	}

	// http://localhost:8562/movie/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMovie(@PathVariable int id) {
		this.movieService.deleteMovieById(id);
	}*/
	
	@RequestMapping(value = "/api/movie", method=RequestMethod.GET)
	public String listmovies(){
		return "List of Movies from Swagger Application";
	}

	
	// Handler Mapper for Displaying a new Movie Form
	@RequestMapping(value = "/api/movie.addMovie", method = RequestMethod.GET)
	public String addMovie() {
		return "New Movie from Swagger Application";
	}

	// Handler Mapper for Inserting/Updating Movie
	@RequestMapping(value = "/api/movie.updateMovie", method = RequestMethod.GET)
	public String updateMovie()  {
		return "update movie from Swagger Application";
	}

	// Handler Mapper for Deleting Employee
	@RequestMapping(value = "/api/movie.deleteMovie", method = RequestMethod.GET)
	public String deleteMovie() throws IOException {
		return "Delete Movie from Swagger Application";
	}

	// Handler Mapper for editing Employee
	@RequestMapping(value = "/api/movie.editMovie", method = RequestMethod.GET)
	public String editMovie() throws IOException {
		return "Edit Movie from Swagger Application";
	}
}



