package com.exam.myapp.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource datasourceBean;

	public DataSource getDatasourceBean() {
		return datasourceBean;
	}

	public void setDatasourceBean(DataSource datasourceBean) {
		this.datasourceBean = datasourceBean;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(datasourceBean)
				.usersByUsernameQuery("select a.username, a.password from admin a where a.username=?")
				.authoritiesByUsernameQuery("select a.username, a.role from admin a  where a.username =?");
		auth.jdbcAuthentication().dataSource(datasourceBean)
		.usersByUsernameQuery("select e.username, e.password from enseignant e where e.username=?")
		.authoritiesByUsernameQuery("select e.username, e.role from enseignant e  where e.username =?");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.httpBasic().and().authorizeRequests().antMatchers("/home").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/reservation").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/ajoutreservation").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/supprimerreservation").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/getallreservation").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/getbyidreservation").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/plat").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/ajoutplat").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/supprimerplat").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/getallplat").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/getbyidplat").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/menu").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/ajoutmenu").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/supprimermenu").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/getallmenu").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/getbyidmenu").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/client").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/ajoutclient").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/supprimerclient").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/getallclient").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/getbyidclient").hasAnyAuthority("admin,user");
		http.httpBasic().and().authorizeRequests().antMatchers("/users").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/ajoutusers").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/supprimerusers").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/getallusers").hasAuthority("admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/getbyidusers").hasAuthority("admin");
		http.formLogin().loginPage("/login").passwordParameter("password").usernameParameter("username")
				.defaultSuccessUrl("/home").failureUrl("/erreur");
		http.logout().logoutSuccessUrl("/");

	}

}
