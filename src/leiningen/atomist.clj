(ns leiningen.atomist
  (:require [com.atomist.automation.registry]
            [com.atomist.automation.core]
            [com.atomist.automation.config-service]
            [mount.core :as mount]
            [clojure.tools.logging :as log]))

(defn ^{:event {:name "pushes-to-repo"
                :secrets ["github://org_token?scopes=repo"]
                :description "Trigger builds based on pushes"
                :subscription "subscription pushes {
                                  Push {
                                    repo {
                                      name
                                    }
                                  }
                                }"}}
  pushes-to-repo
  [event]
  (println "A push!"))

(defn atomist
  "Build this project with Atomist"
  [project & args]
  (println "Connecting to Atomist...")
  (println (mount/start))
  #_(println
     (-> (mount/only #{#'com.atomist.automation.config-service/env
                       #'com.atomist.automation.registry/registrations
                       #'com.atomist.automation.core/api-connection})
         (mount/with-args {:config ["resources/config.edn"]})
         (mount/start)))
  (log/error "Connected...")
  (.join (Thread/currentThread)))

