(ns clojure-backend-challenge.query-user-type
  (:require [clojure-backend-challenge.database]
            [korma.core :refer :all]))

(defentity user_type)

(defn get-user-types []
  (select user_type))

(defn add-user-type [description]
  (print description))
  ;(insert user_type
  ;        (values {:description description})))

(defn get-user-type [id]
  (first
    (select user_type
            (where {:id [= id]}))))