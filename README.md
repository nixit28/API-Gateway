# API-Gateway
API Gateway Demo

Requries to have [redis] server running

There are two projects in this repository, one is UI and another is for the RESOURCE.
UI project is contains the API gateway and RESOURCE part contains the backend API. this project contains the basic demonstration of the API Gateway

I have confrgured the RESOURCE project to run on the 9000 port

For the proxy I have used the embedded Zuul proxy. those configuration can be found in [application.yml]



[redis]:http//redis.io
[application.yml]:https://github.com/nixit28/API-Gateway/blob/master/ui/src/main/resources/application.yml
