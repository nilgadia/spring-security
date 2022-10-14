## _Steps to implement spring security_

`Add dependency spring-boot-starter-security`<br>
`Start application`<br>
`Access application resources`<br>
`http://<Ip Address>:<port>/optional-<contextPath>/<pagePath>` <br>
`A login form page will appear, enter user as 'user' and password is application generated`<br>
`which is genereated on application start up.`<br>
` Copy it from console log. e.g, Using generated security password: 1724bf97-839d-4553-b930-e7ed4406c580 `

###### Important - By default, spring caches the password from first login

### SPRING SECURITY FLOW

##### INTERNAL FLOW

* org.springframework.security.web.authentication.AuthenticationFilter (Class)
* org.springframework.security.authentication.AuthenticationManager (Interface)
* org.springframework.security.authentication.AuthenticationProvider (Interface)
* org.springframework.security.core.userdetails.UserDetailsService (Interface)
* org.springframework.security.crypto.password.PasswordEncoder (Interface)
* org.springframework.security.core.context.SecurityContext (Interface)
* org.springframework.security.core.Authentication (Interface)

<pre>
1. AuthenticationFilter A filter that intercepts and performs authentication of a particular 
   request by delegating it to the authentication manager If authentication is successful, the 
   authentication details is set into SecurityContext
2. Authentication Using the supplied values from the user like username and password, the authentication 
   object will be formed which will be given as an input to the AuthenticationManager interface
3. AuthenticationManager Once received request from filter it delegates the validating of the user 
   details to the authentication provider
4. AuthenticationProvider It has all the logic of validating user details using UserDetailsService 
   and PasswordEncoder
5. UserDetailsService UserDetailsService retrieves UserDetails and implements the User interface using 
   the supplied username
6. PasswordEncoder Service interface for encoding passwords
7. SecurityContext Interface defining the minimum security information associated with the current 
   thread of execution It holds the authentication data post successful authentication
</pre>