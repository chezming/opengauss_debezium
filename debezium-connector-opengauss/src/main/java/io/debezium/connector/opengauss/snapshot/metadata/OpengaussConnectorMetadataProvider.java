/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.connector.opengauss.snapshot.metadata;

import io.debezium.metadata.ConnectorMetadata;
import io.debezium.metadata.ConnectorMetadataProvider;

public class OpengaussConnectorMetadataProvider implements ConnectorMetadataProvider {

    @Override
    public ConnectorMetadata getConnectorMetadata() {
        return new OpengaussConnectorMetadata();
    }
}
