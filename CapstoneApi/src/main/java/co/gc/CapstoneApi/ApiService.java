package co.gc.CapstoneApi;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {

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

	/*
	 * public Movie findMovie() {
	 * 
	 * String url = "https://forecast.weather.gov/MapClick.php?lat=" + lat + "&lon="
	 * + lon + "&FcstType=json";
	 * 
	 * Movie movie = rt.getForObject(url, Movie.class);
	 * 
	 * return movie;
	 * 
	 * }
	 */
}
