/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package io.debezium.connector.opengauss;

import org.junit.Before;

import io.debezium.config.AbstractFieldTest;

public class FieldTest extends AbstractFieldTest {

    @Before
    public void before() {
        setAllConnectorFields(OpengaussConnectorConfig.ALL_FIELDS);
    }

}
