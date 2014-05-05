package utils;

/*
 * #%L
 * net.osgiliath.hello.routes
 * %%
 * Copyright (C) 2013 Osgiliath
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

import javax.inject.Named;

import org.apache.camel.dataformat.xstream.XStreamDataFormat;

import com.thoughtworks.xstream.XStream;

/**
 * 
 * @author charliemordant
 * Mandatory for xstream camel processing (xstream is not able to recognize its classloader
 */
@Named("xstream")
public class XStreamDataFormatWithGoodClassLoader extends XStreamDataFormat {
    /**
     * sets the right classloader for xstream
     */
    public XStreamDataFormatWithGoodClassLoader() {
	super();
	final XStream xStream = new XStream();
	xStream.setClassLoader(this.getClass().getClassLoader());
	this.setXstream(xStream);
    }
}
