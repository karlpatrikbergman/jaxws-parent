Very basic jax-ws sample. A version of example from "Java Web Services Up And Running"
Exemplifies java-first implementation of SOAP Web Service. 

To run service:
- Run BandServicePublisher
- Check out generated xsdhttp://localhost:8888/bands?xsd=1
- Check out generated wsdl http://localhost:8888/bands?wsdl

To run client against service:
- Run BandClientIT

Client files where generated using:
wsimport -p client -keep http://localhost:8888/bands?wsdl
(within folder src/main/java in band-client)