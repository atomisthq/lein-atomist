
(defproject lein-atomist "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache-2.0"}
  :vcs :git
  :dependencies [[com.atomist/automation-client-clj "0.4.2"]

                 ;; logging
                 [io.clj/logging "0.8.1"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [org.slf4j/jcl-over-slf4j "1.7.25"]
                 [org.slf4j/jul-to-slf4j "1.7.25"]
                 [org.slf4j/log4j-over-slf4j "1.7.25"]
                 [org.slf4j/slf4j-api "1.7.25"]]
  :eval-in-leiningen true)
