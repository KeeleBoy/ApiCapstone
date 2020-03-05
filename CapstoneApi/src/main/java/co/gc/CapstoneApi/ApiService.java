package co.gc.CapstoneApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.gc.CapstoneApi.entity.Movie;
import co.gc.CapstoneApi.entity.SearchResponse;

@Component
public class ApiService {
	
	@Value("${api_key}")
	String apiKey;

	private RestTemplate rt;

	// initialization block that runs when a new instance of the class is created
	// loaded before the constructor
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "ooeeee!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Movie> searchMovie(String search) {
		String url = ("http://www.omdbapi.com/?apikey="+apiKey +"&s="+search);
		SearchResponse response = rt.getForObject(url, SearchResponse.class);
			
		return response.getSearch();
}
	
//	public List<Movie> searchMovie(String search, String year) {
//		String url = ("http://www.omdbapi.com/?apikey="+apiKey +"&s="+search+"y="+year);
//		SearchResponse response = rt.getForObject(url, SearchResponse.class);
//			
//		return response.getSearch();
//}
	
	
	public List<Movie> searchYear(String search, String year) {
		String url = ("http://www.omdbapi.com/?apikey="+apiKey +"&s="+search+"&y="+year);
		SearchResponse response = rt.getForObject(url, SearchResponse.class);
			
		return response.getSearch();
}
	
	public List<Movie> searchType(String search, String type) {
		String url = ("http://www.omdbapi.com/?apikey="+apiKey +"&s="+search+"&type="+type);
		SearchResponse response = rt.getForObject(url, SearchResponse.class);
			
		return response.getSearch();
}
	
	public List<Movie> searchAll(String search, String year, String type) {
		String url = ("http://www.omdbapi.com/?apikey="+apiKey +"&s="+search+"&y="+year +"&type="+type);
		SearchResponse response = rt.getForObject(url, SearchResponse.class);
			
		return response.getSearch();
}
	
		
	public Movie getMovie(String id) {
	String url = "http://www.omdbapi.com/?apikey="+apiKey+"&i="+id;
	
	Movie movie = rt.getForObject(url, Movie.class);
	System.out.println(movie.toString());
	return movie;
}
	

	
//	public List<Doc> getArticlesFromSearch(){
//		String url="api/newyorktimes..."+query +
		//apiKey;   etc.
		//^hide in the hidden application.properties file
		
		//ArticleSearchResponse response = rt.getForObject(url, ArticleSearchResponse.class);
		//^gives us the outer-outer
		
//		ArticleResponse article = response.getResponse();
		//^dig in one layer to get the article
			//<--note that we're piercing the layers that we created under the 
		//.model package


}