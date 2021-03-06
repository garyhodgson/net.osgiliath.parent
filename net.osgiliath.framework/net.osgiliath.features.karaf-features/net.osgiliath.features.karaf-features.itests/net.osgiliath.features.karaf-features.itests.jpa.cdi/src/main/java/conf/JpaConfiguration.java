package conf;

/*
 * #%L
 * net.osgiliath.features.karaf-features.itests.jpa.cdi
 * %%
 * Copyright (C) 2013 - 2014 Osgiliath corp
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import net.osgiliath.helpers.cdi.eager.Eager;

import org.ops4j.pax.cdi.api.OsgiService;
/**
 * 
 * @author charliemordant
 * JPA configuration with CDI
 */
@Eager
public class JpaConfiguration {
    /**
     * Aries static declaration
     */
    private static final String emfContainerConstant = "(org.apache.aries.jpa.container.managed=true)";
    
    /**
     * Entity manager factory
     */
    @Inject
    @OsgiService
    // (dynamic=true,required=true/*, filter =
    // "(osgi.unit.name=myTestPu)"*/)//"(&(osgi.unit.name=myTestPu) "+emfContainerConstant+")")
    private EntityManagerFactory emf;
    /**
     * transaction manager
     * @return manager
     */
    // @Inject
    // @OsgiService(dynamic=true,required=true)
    // private TransactionManager txManager;
    /**
     * Entity manager producer
     * @return the entity manager
     */
    @Produces
    protected EntityManager createEntityManager() {
	return this.emf.createEntityManager();
    }
    // @Produces
    // @Default
    // protected TransactionManager createTx() {
    // return this.txManager;
    // }
    // protected void closeEntityManager(@Disposes @Default EntityManager
    // entityManager) {
    // if (entityManager.isOpen()) {
    // entityManager.close();
    // }
    // }
}
