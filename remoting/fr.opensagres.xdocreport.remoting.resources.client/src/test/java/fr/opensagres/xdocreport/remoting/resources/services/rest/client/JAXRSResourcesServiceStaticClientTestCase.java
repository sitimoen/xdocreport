package fr.opensagres.xdocreport.remoting.resources.services.rest.client;

import fr.opensagres.xdocreport.remoting.resources.services.rest.JAXRSResourcesService;

public class JAXRSResourcesServiceStaticClientTestCase  extends AbstractJAXRSResourcesServiceTest
{





	public JAXRSResourcesService getClient() {
		JAXRSResourcesService client = JAXRSResourcesServiceClientFactory.create( BASE_ADDRESS );
		return client;
	}

}
