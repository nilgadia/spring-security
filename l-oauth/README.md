[https://oauth.net/2/](https://oauth.net/2/)</br>
[https://developers.google.com/identity/protocols/oauth2](https://developers.google.com/identity/protocols/oauth2)</br>
[https://oauth.com/playground/](https://oauth.com/playground/)</br>
<img src="images/oauth.png">
<img src="images/oauth1.png">

#### Steps to run this demo
###### Registering the client details with the GitHub to use it's OAUTH2 Auth server
* login to GitHub account
* go to setting -> developer settings -> oauth app
* register application. (Here our spring boot app is client, you are the resource owner)
* provide application name, homepage url (htttp://localhost:8080/spring-security), callback url same as homepage
* click on register application it will redirect to another page with generated client id
* click on generate client secret to generate secret
