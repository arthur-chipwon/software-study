package com.chirpwow.ide.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.chirpwow.ide.Activator;

public class ActivatorTest {

	@Test
	public void testActivatorId() {
		Assertions.assertNotNull(Activator.PLUGIN_ID);
	}

}
