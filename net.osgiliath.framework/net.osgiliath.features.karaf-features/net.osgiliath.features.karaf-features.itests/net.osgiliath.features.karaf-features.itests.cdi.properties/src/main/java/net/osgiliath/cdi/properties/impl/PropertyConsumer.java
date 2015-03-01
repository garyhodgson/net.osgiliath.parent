package net.osgiliath.cdi.properties.impl;

import net.osgiliath.cdi.properties.api.IPropertyConsumer;

import org.apache.deltaspike.core.api.config.ConfigResolver;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;

/*
 * #%L
 * net.osgiliath.features.karaf-features.itests.cdi.properties
 * %%
 * Copyright (C) 2013 - 2014 Osgiliath
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
/**
 * Provides property.
 * @author charliemordant
 *
 */
@OsgiServiceProvider
public class PropertyConsumer implements IPropertyConsumer {

  /*
   * (non-Javadoc)
   * 
   * @see net.osgiliath.cdi.properties.impl.IConsumer#getInjectedProperty()
   */
  @Override
  public final String getInjectedProperty() {
    return ConfigResolver.getPropertyValue("injectedProperty");
  }

}
