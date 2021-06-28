(ns clojure-backend-challenge.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
    {:classname   "com.mysql.jdbc.Driver"
     :subprotocol "mysql"
     :user        "backend"
     :password    "backend"
     :subname     "//localhost:3306/payment"}))

; set up korma
(korma/defdb db db-connection-info)