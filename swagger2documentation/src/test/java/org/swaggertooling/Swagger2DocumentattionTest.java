/*
 * Copyright (c) 2018, Ivan Saorin (https://github.com/ivan.saorin).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.swaggertooling;

import java.io.File;
import java.io.FileNotFoundException;

import org.apitooling.export.ExporterType;
import org.apitooling.utils.walker.ApiWalker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Swagger2DocumentattionTest {

	private static Logger logger = LoggerFactory.getLogger(Swagger2DocumentattionTest.class);
	
	private File BASE = new File(".\\target\\test-classes\\");
	@Before
	public void Before() {
		
	}
	
	@Test
	public void test() throws Exception {
		if (!BASE.exists()) {
			throw new FileNotFoundException("The directory do not exist: " + BASE.getAbsolutePath());
		}
		logger.warn("Base set to: {}", BASE.getAbsolutePath());
		new ApiWalker(BASE, "api", "output", "xml", new String[] {"[withNotes].yaml", "[withoutNotes].yaml", ".json"}, ExporterType.MSWORD).walk();
		
	}
	
	@After
	public void after() {

	}
	
}
