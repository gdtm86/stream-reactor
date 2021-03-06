package com.datamountaineer.streamreactor.connect.cassandra

import java.util

import io.confluent.common.config.ConfigDef.{Importance, Type}
import io.confluent.common.config.{AbstractConfig, ConfigDef}


object CassandraSinkConfig {
  val KEY_SPACE = "key.space"
  val KEY_SPACE_DOC = "Keyspace to write to."
  val CONTACT_POINTS = "contact.points"
  val CONTACT_POINT_DOC = "Initial contact point host for Cassandra including port."
  val CONTACT_POINT_DEFAULT = "localhost"
  val PORT = "port"
  val PORT_DEFAULT = "9042"
  val PORT_DOC = "Cassandra native port."
  val INSERT_JSON_PREFIX = "INSERT INTO "
  val INSERT_JSON_POSTFIX = " JSON '?';"
  val PAYLOAD = "payload"

  val config: ConfigDef = new ConfigDef()
                          .define(CONTACT_POINTS, Type.STRING, CONTACT_POINT_DEFAULT, Importance.HIGH,CONTACT_POINT_DOC)
                          .define(KEY_SPACE, Type.STRING, Importance.HIGH, KEY_SPACE_DOC)
                          .define(PORT, Type.INT, PORT_DEFAULT, Importance.HIGH, PORT_DOC)

}

/**
  * <h1>CassandraSinkConfig</h1>
  *
  * Holds config, extends AbstractConfig.
  * */
class CassandraSinkConfig(props: util.Map[String, String])
  extends AbstractConfig(CassandraSinkConfig.config, props) {
}