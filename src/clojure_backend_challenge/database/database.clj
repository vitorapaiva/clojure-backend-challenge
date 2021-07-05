(ns clojure-backend-challenge.database.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
    {:classname   "com.mysql.cj.jdbc.Driver"
     :subprotocol "mysql"
     :db          "backend"
     :user        "backend"
     :password    "backend"
     :host        "localhost"
     :port        "51002"}))

; set up korma
(korma/defdb db db-connection-info)