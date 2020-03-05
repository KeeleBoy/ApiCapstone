package co.gc.CapstoneApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.gc.CapstoneApi.entity.Movie;

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
	
//	public List<Movie> searchMovie(String search) {
//		String url = "http://www.omdbapi.com/?apikey="+apiKey+"&?s="+search;
//		
//		Search search = rt.getForObject(url, Search.class);
		
		
		
//				 * + lon + "&FcstType=json";
//				 * 
//				 * Movie movie = rt.getForObject(url, Movie.class);
//				 * 
//				 * return movie;
//		
//	}
	
//	
//	public List<Card> drawCards(Integer count) {
//
////		// generate your own key
//		String deckId = "s29ceirssuxj";
//
//		String url = "https://deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=" + count;
//
//		DeckResponse response = rt.getForObject(url, DeckResponse.class);
//
//		if(response.getRemaining()<1) {
//			
//		}
//		
//		return response.getCards();
//
//	}
//	
//	/*
//	 * public Movie findMovie() {
//	 * 
//	 * String url = "https://forecast.weather.gov/MapClick.php?lat=" + lat + "&lon="
//	 * + lon + "&FcstType=json";
//	 * 
//	 * Movie movie = rt.getForObject(url, Movie.class);
//	 * 
//	 * return movie;
//	 * 
//	 * }
//	 */
//}
}