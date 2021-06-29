(defproject clojure-backend-challenge "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [compojure "1.6.2"]
                 [ring "1.9.3"]
                 [ring/ring-json "0.5.1"]
                 [korma "0.4.3"]
                 [mysql/mysql-connector-java "8.0.25"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler clojure-backend-challenge.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}}
  :repl-options {:init-ns clojure-backend-challenge.core})

