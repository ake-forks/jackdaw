(defproject fundingcircle/jackdaw-client "0.1.0-SNAPSHOT"
  :description "Clojure wrapper for Apache Kafka Producer and Consumer APIs"
  :url "http://github.com/FundingCircle/jackdaw"
  :dependencies [[org.apache.kafka/kafka-clients "0.10.2.1"
                  :exclusions [com.fasterxml.jackson.core/jackson-annotations
                               com.fasterxml.jackson.core/jackson-core]]
                 [org.apache.kafka/kafka_2.11 "0.10.2.1"
                  :exclusions [com.fasterxml.jackson.core/jackson-annotations
                               com.fasterxml.jackson.core/jackson-core]]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]])