# CDI integration test

To integrate cdi, you've to look at these files:

* [osgi.bnd CDI extension requierement](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.framework/net.osgiliath.features.karaf-features/net.osgiliath.features.karaf-features.itests/net.osgiliath.features.karaf-features.itests.cdi/osgi.bnd)
* [Beans.xml mandatory file](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.framework/net.osgiliath.features.karaf-features/net.osgiliath.features.karaf-features.itests/net.osgiliath.features.karaf-features.itests.cdi/src/main/resources/META-INF/beans.xml)
* [CDI Osgi service registration](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.framework/net.osgiliath.features.karaf-features/net.osgiliath.features.karaf-features.itests/net.osgiliath.features.karaf-features.itests.cdi/src/main/java/net/osgiliath/cdi/impl/Provider.java)
* [CDI Osgi service consuming via inject](https://github.com/OsgiliathEnterprise/net.osgiliath.parent/blob/master/net.osgiliath.framework/net.osgiliath.features.karaf-features/net.osgiliath.features.karaf-features.itests/net.osgiliath.features.karaf-features.itests.cdi/src/main/java/net/osgiliath/cdi/impl/Consumer.java)

Relevant doc: 

* https://ops4j1.jira.com/wiki/display/PAXCDI/Pax+CDI