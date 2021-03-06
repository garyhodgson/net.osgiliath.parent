# Business module: blueprint way

## Relevant files
### Common
* [osgi.bnd](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/osgi.bnd): jaxrs providers imports, validation packages

### Validation
* [Validation factory import, validator instanciation and injection via blueprint](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/main/resources/OSGI-INF/blueprint/business.osgi-context.xml)
* [Validation usage: violation retreiving and throwing HTTP 500 error containing errors](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/main/java/net/osgiliath/hello/business/impl/services/impl/HelloServiceJaxRS.java)

### REST Services
* [REST http access definition](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/main/java/net/osgiliath/hello/business/impl/HelloServiceJaxRS.java)
* [REST service implementation](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/main/java/net/osgiliath/hello/business/impl/services/impl/JpaHelloServiceJaxRS.java)
* [Providers, bus and web service definition in blueprint context](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/main/resources/OSGI-INF/blueprint/business.osgi-context.xml)
* [Model entity to send](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.spi/src/main/java/net/osgiliath/hello/business/model/Hellos.java)
* [Jaxb index file enabling marshalling/unmarshalling](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.spi/src/main/java/net/osgiliath/hello/business/model/jaxb.index)

### Access REST UI management
* With the use of Swagger (defining your API with annotations), you have access to a management UI allowing you to query your services.
* Just navigate to your host:port/api-docs to see the ui
* Then enter http://localhost:port/cxf/yourserver/api-docs on the 'server url' input field
* You can finally query your model elements  

### Messaging services
* [Messaging implementation](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/main/java/net/osgiliath/hello/business/impl/services/impl/HelloServiceJMS.java)
* [Messaging factory and transactional messaging factory service reference, camel context instanciation via blueprint](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/main/resources/OSGI-INF/blueprint/business.osgi-context.xml)

### Testing
* [Testing REST and messaging services](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.business/net.osgiliath.hello.business.impl.blueprint/src/it/java/net/osgiliath/hello/business/impl/services/impl/itests/ITHelloServiceJaxRS.java)

### Production
* [Business and business itest feature declaration](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.samples/net.osgiliath.hello/net.osgiliath.hello.features/src/main/resources/net.osgiliath.hello.features.xml)

