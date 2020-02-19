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
				.authoritiesByUsernameQuery("select a.username, a.role from admin a where a.username =?");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.httpBasic().and().authorizeRequests().antMatchers("/home").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/admin").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/admin/ajout").hasAuthority("master");
		http.httpBasic().and().authorizeRequests().antMatchers("/admin/suppr").hasAuthority("master");
		http.httpBasic().and().authorizeRequests().antMatchers("/admin/modif").hasAuthority("master");
		http.httpBasic().and().authorizeRequests().antMatchers("/admin/find").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/admin/findall").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/enseignant").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/enseignant/ajout").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/enseignant/suppr").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/enseignant/modif").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/enseignant/find").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/enseignant/findall").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/grade").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/grade/ajout").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/grade/suppr").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/grade/modif").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/grade/find").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/grade/findall").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/salle").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/salle/ajout").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/salle/suppr").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/salle/modif").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/salle/find").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/salle/findall").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/seance").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/seance/ajout").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/seance/suppr").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/seance/modif").hasAnyAuthority("master,admin");
		http.httpBasic().and().authorizeRequests().antMatchers("/seance/find").hasAnyAuthority("master,admin,enseignant");
		http.httpBasic().and().authorizeRequests().antMatchers("/seance/findall").hasAnyAuthority("master,admin,enseignant");
		http.formLogin().loginPage("/login").passwordParameter("password").usernameParameter("username")
				.defaultSuccessUrl("/home").failureUrl("/erreur");
		http.logout().logoutSuccessUrl("/");

	}

}
