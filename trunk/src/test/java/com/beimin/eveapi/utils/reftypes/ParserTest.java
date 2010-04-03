package com.beimin.eveapi.utils.reftypes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.beimin.eveapi.eve.reftypes.ApiRefType;
import com.beimin.eveapi.eve.reftypes.RefTypesParser;
import com.beimin.eveapi.eve.reftypes.RefTypesResponse;

public class ParserTest {

	@Test
	public void testRefTypesParser() throws IOException, SAXException {
		RefTypesParser parser = RefTypesParser.getInstance();
		InputStream input = ParserTest.class.getResourceAsStream("/RefTypes.xml");
		RefTypesResponse response = parser.getResponse(input);
		assertNotNull(response);
		Collection<ApiRefType> refTypes = response.getRefTypes();
		assertEquals(87, refTypes.size());
		boolean found = false;
		for (ApiRefType refType : refTypes) {
			if (refType.getRefTypeID() == 10) {
				found = true;
				assertEquals("Player Donation", refType.getRefTypeName());
			}
		}
		assertTrue("test refType wasn't found.", found);
	}
}