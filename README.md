STARQUEST

Welcome to StarQuest Repository. This repository contains sevearal java services

02/27/2017
Initial Delivery of
Cryptography implementation and Javadoc API.

What is working, & what is not
CSPRNG is working properly. But generating  Salt from Native library is not working properly on all environment. stay tuned..



<b>02/28/2017</b>
Micro Service added for encrypting given value.


<b>02/28/2017</b>
Added a Restful Service that runs on WildFly swarm
Added a Restful Service that runs on Spring boot
Above both modules dockerized on java:8

<b>03/01/2017</b>
Add a Micro Service for Encrypting a String using CSPRNG Salt.
Added the service in WildFly Swarm
Added the WildFly Swarm to a java Docker image 
visit: https://hub.docker.com/
Search for malleshnagothi to find all of my docker images

What is not working
The service is not flexible (yet) for using multiple alogorithms. But implementation exist, need to expose  more endpoints..coming up







