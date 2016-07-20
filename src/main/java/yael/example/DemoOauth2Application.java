package yael.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableOAuth2Sso
public class DemoOauth2Application extends WebSecurityConfigurerAdapter{

  @RequestMapping("/user")
  public Principal user(Principal principal) {
    return principal;
    
     @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .antMatcher("/**")
      .authorizeRequests()
        .antMatchers("/", "/login**", "/webjars/**")
        .permitAll()
      .anyRequest()
        .authenticated();
  }
  }

	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2Application.class, args);
	}
}
